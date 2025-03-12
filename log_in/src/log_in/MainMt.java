package log_in;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMt {

	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
//		ArrayList<String> id = new ArrayList<>();
		
//		ArrayList<String> password = new ArrayList<>();
		
//		if(!id.contains())
		
		login loginn = new login();
		
		while(true) {
			switch(log()) {
			case 1:
//				int id = loginn.screen();
//				if(id != 0 ) {
//					
//					System.out.print("아이디입력 : ");
//					String userId = sc.nextLine();
//			
//					return;
//				} 
			}
		}
	}
			private static Scanner sc = new Scanner(System.in);
			private static int log() {
		
			System.out.println("\n\n============메뉴============");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int num = sc.nextInt();
			return num;
			
			
		}
			
	}





