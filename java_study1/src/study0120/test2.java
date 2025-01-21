package study0120;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		// System.out.println("출력하는방법");
		// Scanner 변수이름 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		// num 이라는 변수에 정수 데이터 입력하여 저장하기
		// nextInt()가 정수 데이터 입력하기 위한 메서드이다.
		// System.out.print("정수 입력 : ");
		// int num = sc.nextInt();
		// System.out.println( "입력 잘되었나? "+ num);
		
		 //사각형의 너비와 높이를 키보드를 통해 입력받고 넓이를 계산하여 출력해라.
		 int width=0, height=0; // 변수명에 노란줄은 아직 사용하지 않은것을 의미
		 System.out.print("너비 입력 : ");
		 width = sc.nextInt();
		 System.out.print("높이 입력 : ");
		 height = sc.nextInt();
		 int area = width * height;
		 System.out.println("넓이 : "+ area);
		
//		System.out.println("너비 입력 : ");
//		int width = sc.nextInt();
//		System.out.println("높이 입력 : ");
//		int height = sc.nextInt();
//		System.out.println("사각형의 넓이는 " + width*height);
	}
}
