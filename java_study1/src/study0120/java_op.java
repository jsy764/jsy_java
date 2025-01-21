package study0120;

import java.util.Scanner;

public class java_op {
	public static void main(String[] args) {
		
		// 변수는 - 데이터를 저장하기 위한 메모리 공간
		// 변수의 이름 - 데이터가 저장된 공간을 사용하기 위해 부여한 별명
		// 변수 선언 방법 - 데이터타입 변수이름(예 - int num;)
		// 저장한 데이터에 맞는 데이터타입을 설정해야한다.
		// 변수이름의 첫글자는 문자로, 자바 예약어는 사용불가
		
		// 자바에서 결과로 출력하는방법
		// System.out.println("출력하는방법");
		// 자바에서 키보드를 통해 데이터를 입력하는 방법
		// 자바에서 입력하기 위한 순서
		// 1. 입력 객체 생성
		// 2. 입력 객체를 통해 데이터에 맞는 입력메서드 호출
		
		// Scanner 변수이름 = new Scanner(System.in);
		 Scanner sc = new Scanner(System.in);
		
		// num 이라는 변수에 정수 데이터 입력하여 저장하기
		// nextInt()가 정수 데이터 입력하기 위한 메서드이다.
		// System.out.print("정수 입력 : ");
		// int num = sc.nextInt();
		// System.out.println( "입력 잘되었나? "+ num);
		/*
		 * 1월 20일 과제(변수 활용 문제)
		 * 
		 * 사과 상자에 사과가 20개 들어있다.
		 * 오렌지 상자에 오렌지 15개 들어있다.
		 * 사과 상자는 11개, 오렌지 상자는 12개 있다면
		 * 과일은 총 몇개인가?
		 * (출력결과는 친절하게~)
		 * 
		 * int apple = 20;
		 * int appleBox = 11;
		 * int orange = 15;
		 * int orangeBox = 12;
		 * 
		 * int totalApple = appleBox * apple;
		 * int totalOrange = orangeBox * orange;
		 * int totalFruit = totalApple + totalOrange;
		 * System.out.println("사과 총 갯수 : " + totalApple);
		 * System.out.println("오렌지 총 갯수 : " + totalOrange);
		 * System.out.println("과일 총 갯수 : " + totalFruit);
		 */
		 // 사각형의 너비와 높이를 키보드를 통해 입력받고 넓이를 계산하여 출력해라.
		 System.out.println("너비 입력 : ");
		 int width = sc.nextInt();
		 System.out.println("높이 입력 : ");
		 int height = sc.nextInt();
		 System.out.println(width*height);
		 
	}
}
