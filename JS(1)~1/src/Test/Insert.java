package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class Insert {
	public void insert(int code,int price , String menu,String name){

		Connection conn = null;
		PreparedStatement pstmt = null;
		// try �����ȿ� �ִ� ������ �����ϴٰ� ������ �߻��ϸ� catch�� ������
		try {
			// ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AI", "1234");
			
			pstmt = conn.prepareStatement(
					"insert into no_"+name+" (code,menu,price,amount,sales)"
					+"VALUES ("+code+","+"'"+menu+"'"+","+price+",0,0)");
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// ���� ���н�
			System.out.println("����");
		} finally {
			try {
				// ���� �� ����
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}