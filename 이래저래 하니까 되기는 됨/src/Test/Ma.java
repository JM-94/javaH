package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ma extends JDialog{
	private JTable table = new JTable();
	Connection conn = null;
	PreparedStatement ps = null;

	ResultSet rs = null; // 셀렉 출력
	
	public Ma(){
		setSize(565,500);
		setLocation(100,500);
		getContentPane().setLayout(null);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"1", "2", "3", "4", "5"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 525, 441);
		getContentPane().add(scrollPane);
		
		
		table.setBounds(0, 0, 1, 1);



		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AI", "1234");
			ps = conn.prepareStatement("select * from ma");
			// ma를 테이블 이름으로 수정 테이블 이름 뭐임?????????

			rs = ps.executeQuery();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setNumRows(0);
			String str[] = new String[5];
			while (rs.next()) {
				str[0]=rs.getString(1);
				str[1]=rs.getString(2);
				str[2]=rs.getString(3);
				str[3]=rs.getString(4);
				str[4]=rs.getString(5);
				model = (DefaultTableModel) table.getModel();
				model.addRow(str);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		
		
		
		
//		getContentPane().add(table);
		setVisible(true);
		
	}
}
