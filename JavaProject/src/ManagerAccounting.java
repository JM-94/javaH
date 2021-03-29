import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ManagerAccounting {

// 갱신
	public void updateAccountingtable() {

		Scanner scan = new Scanner(System.in);

		int 코드;
		String 메뉴 = null;
		int 판매가격;
		int 원가;
		double 부가세;
		int 수량;
		int 매출;
		
		System.out.println("코드 입력 ");
		코드 = AccountingMain.scan.nextInt();
		System.out.println("메뉴 입력");
		메뉴 = AccountingMain.scan.next();
		System.out.println("판매가격 입력");
		판매가격 = AccountingMain.scan.nextInt();
		System.out.println("원가 입력");
		원가 = AccountingMain.scan.nextInt();


		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AI","1234");

			System.out.println("DB 연결 성공");

			pstmt = conn.prepareStatement("UPDATE ACCOUNTING " + "SET 코드 = ?, 메뉴 = ?, 판매가격 = ?, 원가 = ?, 부가세 = ?, 수량 = ?, 매출 = ? " + "WHERE IDX = ? ");
			pstmt.setInt(1, 코드);
			pstmt.setString(2, 메뉴);
			pstmt.setInt(3, 판매가격);
			pstmt.setInt(4, 원가);
			pstmt.setDouble(5, 부가세 = 판매가격 * 0.1);
//			pstmt.setInt(6, 수량); //수량을 어떻게 받아야하나..
//			pstmt.setInt(7, 매출 = 판매가격 * 수량); //수량을 어떻게 받아야하나..

			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("에러 그 클래스 파일 없음");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//------------------------------------------------------------------------------------------------------------------------------신메뉴 출시하면 메뉴 추가?
/*
	public void insertAccountingtable() {

		Scanner scan = new Scanner(System.in);

		int 코드 ;
		String 메뉴 = null;
		int 판매가격 ;
		int 원가 ;

		System.out.println("코드 입력 ");
		코드 = AccountingMain.scan.nextInt();
		System.out.println("메뉴 입력");
		메뉴 = AccountingMain.scan.next();
		System.out.println("판매가격 입력");
		판매가격 = AccountingMain.scan.nextInt();
		System.out.println("원가 입력");
		원가 = AccountingMain.scan.nextInt();

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AI","1234");

			System.out.println("DB 연결 성공");

			pstmt = conn.prepareStatement("INSERT INTO ACCOUNTING " + "(코드, 메뉴, 판매가격, 원가) " + "VALUES " + "(?,?,?,?)");
			pstmt.setInt(1, 코드);
			pstmt.setString(2, 메뉴);
			pstmt.setInt(3, 판매가격);
			pstmt.setInt(4, 원가);

			pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("에러 그 클래스 파일 없음");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
*/
//------------------------------------------------------------------------------------------------------------------------------

// 조회
	public void selectAccountingtable() {
		Connection conn = null; // DB 연결 객체
		PreparedStatement pstmt = null; // SQL 구문작성 객체
		ResultSet rs = null; // table 내용을 담는 객체

		System.out.println("   코드                        메뉴                       가격           원가         부가세    수량    매출");
		System.out.println("=========================================================");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AI","1234");

			pstmt = conn.prepareStatement("select * from ACCOUNTING");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt(1) + " | ");
				System.out.printf("%12s",rs.getString(2));
				System.out.print(" | " + rs.getInt(3) + " | ");
				System.out.print(rs.getInt(4));
				System.out.print(" | " + rs.getInt(5) + " | ");
				System.out.print(rs.getInt(6));
				System.out.println(" | " + rs.getInt(7));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}
}