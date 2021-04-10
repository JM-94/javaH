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
		// try 구문안에 있는 내용을 실행하다가 에러가 발생하면 catch로 빠진다
		try {
			// 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AI", "1234");
			System.out.println("DB 연결 성공");
			pstmt = conn.prepareStatement(
							"create table no_"+name+"("+
									"code number(20) ,"+
									"menu VARCHAR(30) ,"+
									"price number(20) ,"+
									"amount number(20) ,"+
									"sales number(20) )"
									);
			pstmt.executeUpdate();
			System.out.println("여기");
		} catch (Exception e) {
			e.printStackTrace();
			// 연결 실패시
			System.out.println("에러");
		} finally {
			try {
				// 연결 후 종료
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
