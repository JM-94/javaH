package Create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class Select {
	
	public void select(String name){
	//a = �ֹ���
	//b = �޴� �ڵ�
		Connection conn = null;
		PreparedStatement pstmt = null;
		// try �����ȿ� �ִ� ������ �����ϴٰ� ������ �߻��ϸ� catch�� ������
		try {
			// ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1234");
			System.out.println("DB ���� ����");
			pstmt = conn.prepareStatement(
							"Select * form no_"+name+""
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
