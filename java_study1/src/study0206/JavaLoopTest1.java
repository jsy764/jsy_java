package study0206;

import java.util.Scanner;

public class JavaLoopTest1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//		문제1 - 무한루프
//			
//			정수 한개씩 계속 입력 받기
//			입력하다가 0을 입력하면
//			지금까지 입력한 모든 숫자의 합 출력
//		int num=0, sum=0;
//		while(true) {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//			sum += num;
//			if(num==0) 
//				break;
//		}
//		System.out.println(sum);

		//		문제2 - 무한루프
//			컴퓨터와 가위바위보 게임하기
//			내가 10번을 이낄때까지 계속 게임하기 
//			10번이기면 그동안 몇번 패배하고 몇번 비겼는지 출력
//		boolean b = true;
//		int user, num=0, com, num1=0, num2=0;
//		while(true) {
//			System.out.print("1.가위 2.바위 3.보 : ");
//			user = sc.nextInt();
//			com = (int)(Math.random()*3+1);
//			if(user==com)
//				num1++;
//			else if(b == ((user==1 && com==3)||(user==2 && com==1)||(user==3 && com==2))) {
//				num++;
//			}
//			else
//				num2++;
//			
//			if(num==10) {
//				break;
//			}
//		}
//		System.out.println("총 비긴 횟수: "+num1);
//		System.out.println("총 진 횟수: "+num2);

		//		문제3
//		컴퓨터와 주사위 게임을 한다. 각각 주사위 2개를 던져서 주사위 합이 큰쪽이 이긴다.
//		단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다.
//		예) 나 - 3,4 컴 - 1,3 내가 이김
//			나 - 5,6 컴 - 1, 1 컴퓨터이김
//		5판을 진행 했을때 몇승 몇패 몇무인지 출력
		int user, com, i=0;
		while(i<5) {
			
		}
		
		
		
		
		
	}
}
