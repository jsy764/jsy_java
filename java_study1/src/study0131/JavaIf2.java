package study0131;

import java.util.Scanner;

public class JavaIf2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		if(조건식) { 조건식이 참이라면 조건식 다음의 중괄호 안에 내용만 실행
//			참일 경우 실행할 내용, 여러줄 가능
//		}
//		
//		if(조건식) {
//			
//		}else { else는 조건식이 거짓일 경우에만 실행
//			거짓일 경우 실행할 내용, 여러줄 가능
//		}
		
//		int 나이 = 25;
//		if(나이 >= 19) {
//			System.out.println("성인 입니다.");
//		} else {
//			System.out.println("청소년입니다.");
//		}
//		int money = 6400;
//		if(money >= 10000) 
//			System.out.println(" 충전 안함");
//		else {
//			System.out.println("잔액 부족"+(10000-money)+" 충전 ");
//			money = (10000-money) + money;
//		}
//		System.out.println("현재 잔액 : " + money);
		
		// 사각형의 너비와 높이이다.
		// 현재 사각형은 정사각형인가 직각 사각형인가??
//		int width = 53, height = 52;
//		if(width == height) {
//			System.out.println("현재 사각형은 정사각형이다.");
//		} else {
//			System.out.println("현재 사각형은 직각사각형이다.");
				// 입력한 숫자가 짝수인가 홀수인가?
				int num=0;
				
				System.out.print("숫자 입력 : ");
				num = in.nextInt();
				
				if(num%2 == 0) {
					System.out.println("짝수이다.");
				} else {
					System.out.println("홀수이다.");
				}
		}
	}
/*
	변수 : 데이터(값)룰 저장하기 위한 메모리 공간
	변수이름 : 데이터가 저장된 메모리공간을 사용하기위해서는 이름을 부여해야 한다.
	 System.out.println(1000);
	 int a = 1000;
	 a=123;
	 a=23;
	 System.out.println(a);
	 
	 변수 선언 : 데이터타입 정하기, 변수이름 정하기
	 		-> 사용할 데이터에 맞춰서 정하기
	 		-> int num; 데이터타입 변수이름;
	 		
	 데이터타입 변환(형변환)
	 	자동 형변환 : 데이터타입이 작은 범위에서 큰 범위로 데이터가 저장되는경우
	 	float a = 10;	-> 자동형변환(실수타입으로)
	 	강제 형변환 : 데이터타입이 큰범위에서 작은범위로 데이러가 저장되는 경우
	 	int b = (int)2.46f;	-> 강제형변환(정수타입으로)
	 	
	 나누기 % : 나머지 구하기
	 ++, -- : 증감연산자 (1씩 증가, 1씩 감소)
*/