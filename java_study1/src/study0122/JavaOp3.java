package study0122;

import java.util.Scanner;

public class JavaOp3 {

	public static void main(String[] args) {
		// 비교연산자 - 두개 데이터를 비교하여 참, 거짓 결과
		
		System.out.println(10 > 5);
		System.out.println(11 < 4);
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력 : ");
		num = scan.nextInt();
		
		System.out.println("5보다 큰숫자인가 ? " + (num > 5));
		boolean big;
		big = num >= 10;
		System.out.println(" 10이상인가 ? " + big);
		
		System.out.println(10 == 10);
		System.out.println(10 == 13);
		
		String word="가나다"; // 문자열을 타입을 타입은 String 클래스타입
		String word2 = new String("가나다");
		
		// System.out.println(word == word2);
		System.out.println(word.equals(word2));
		// == 비교연산자는 비교하는 2개의 값이 같은 자료형인지 판별
	}
}
