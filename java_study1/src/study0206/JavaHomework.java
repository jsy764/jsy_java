package study0206;

import java.util.Scanner;

public class JavaHomework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==== UP & DOWN 게임(컴퓨터버전) ====");
		System.out.print("1~50 중 하나 입력 : ");
		int number = scan.nextInt();
		
		int max = 50, min = 1, t=50;// t변수는 random()*t로 사용
		while(true) {
			System.out.println("범위 : "+ min +"~" + max);
			
			int com = (int)(Math.random()*t + min);
			System.out.println("컴퓨터 : "+com);
			if( number == com ) {
				System.out.println("정답!!");
				break;
			}
			if(number>com) {
				System.out.println("UP");
				min = com + 1; // 업인경우 범위의 최소값 변경
				t = max - com; // 범위의 최대값에서 현재 값을 빼면 * 값 나옴
			}
			if(number<com) {
				System.out.println("DOWN");
				max = com - 1; // 다운인 경우 범위의 최대값 변경
				t = max - min + 1; // 범위의 최대값 - 최소값 + 1하면 * 값나옴
			}
		}

	}

}
