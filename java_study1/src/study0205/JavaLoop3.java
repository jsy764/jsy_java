package study0205;

import java.util.Scanner;

public class JavaLoop3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//for(초기값;조건식;증감식)
		//for(int i=1; i<=10; i++)
		// 반복횟수가 정해져 있는 경우 for문이 가독성이 좋다.
		// 반복횟수가 없는 경우 while문이 가독성이 좋다.
//		int i=1; // 초기값
//		
//		while(i<=10) { //조건식
//			System.out.println(i);
//			i++; //증감식
//		}
		// 21~49 -> * 29 + 21
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
//		while(true) {// 오늘의 과제는 1~50중 하나를 내가 입력하고 내가 입력한 숫자를 컴퓨터가 맞춰야한다.(random 사용)
//			// 무작위로 맞추는게 아니고 범위를 좁히면서 맞출 수 있도록 해야한다.
//			int com = (int)(Math.random()*50+1);
//			if(com==num) {
//				System.out.println("정답 ! ");
//				break;
//			}
//			if(com>num)
//				System.out.println("업");
//			if(com<num)
//				System.out.println("다운");
//		}
		
		// 동전 앞면 뒷면 맞추기 게임
		// 내 돈이 바닥 날때까지 게임진행!!
		
		
	}
}

