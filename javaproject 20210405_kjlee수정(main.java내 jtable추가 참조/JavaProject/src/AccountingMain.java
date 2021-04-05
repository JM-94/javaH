import java.util.Scanner;

public class AccountingMain {

	public static Scanner scan = new Scanner(System.in);

	public AccountingMain() {
		
		ManagerAccounting ma = new ManagerAccounting();
		
		String select = "조회";
		String update = "갱신";
		
		String input = null;
		
		while(true){
		System.out.println("매출 관리 프로그램        |조회| |메뉴 갱신| |메뉴 추가| |종료|");
		input = scan.nextLine();
		if (input.equals(select)){ // 테이블 조회
			ma.selectAccountingtable();
		}
		else if (input.equals(update)){ // 코드와 메뉴를 입력하면 가격을 수정
			ma.updateAccountingtable();
		}
		/*
		 * else if (select == 3) // 메뉴를 추가할 때
			ma.insertAccountingtable();
		*/
		else
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		new AccountingMain();
	}
}
