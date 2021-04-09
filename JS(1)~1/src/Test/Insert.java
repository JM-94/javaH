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
		// try 구문안에 있는 내용을 실행하다가 에러가 발생하면 catch로 빠진다
		try {
			// 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AI", "1234");
			
			pstmt = conn.prepareStatement(
					"insert into no_"+name+" (code,menu,price,amount,sales)"
					+"VALUES ("+code+","+"'"+menu+"'"+","+price+",0,0)");
			pstmt.executeUpdate();
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