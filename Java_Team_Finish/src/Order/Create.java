package Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class Create {
	
	public void create(String name){

		Connection conn = null;
		PreparedStatement pstmt = null;
		// try �����ȿ� �ִ� ������ �����ϴٰ� ������ �߻��ϸ� catch�� ������
		try {
			// ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AI", "1234");
			System.out.println("DB ���� ����");
			pstmt = conn.prepareStatement(
							"create table no_"+name+"("+
									"code number(20) ,"+
									"menu VARCHAR(30) ,"+
									"price number(20) ,"+
									"amount number(20) ,"+
									"sales number(20) )"
									);
			pstmt.executeUpdate();
			System.out.println("����");
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
