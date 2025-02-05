package study0225;

import java.util.Scanner;

public class JavaLoop2 {
// 자바의 변수 종류
// 지역변수, 클래스변수(static), 인스턴스변수
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num=0;
		for(;;) {
			System.out.print("정수 입력 : ");
			num=sc.nextInt();
		}
		
		
		
		
//		for( ; ; ) { // for문 무한 루프
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		if(num == 0) break; // 무한 루프의 종료시점 정하기 if문과 break로
//		}
//		// break는 해당 제어문(반복문, switch)을 종료시키기만한다.
//		// return은 메서드를 종료
//		System.out.println(" 무한루프 종료 되었습니다. ");
		
//		for(int i=1; ; i++) {
//			System.out.println(i);
//		}
		
		//		for(초기값; 조건식; 증감식) {
//			반복내용
//		}
//		초기값 -> 조건식 비교 -> 참이라면 -> {내용} -> 증감식
//		-> 조건식 비교 -> 참이라면 -> { 내용 } -> 증감식
//		-> 조건식 비교 -> 거짓이라면 -> 종료
		
		// 10부터 100까지의 총합을 구하세요
		// 단, 10단위의 숫자만 계산(10,20,30,40,50,60,70,80,90,100)
//		int sum=0;
//		for(int i=10; i<=100; i += 10) {
//			sum += i;
//		}
//		System.out.println("10부터 100까지의 총합: "+sum);
		
		
	}
}
