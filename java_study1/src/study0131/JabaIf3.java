package study0131;

import java.util.Scanner;

public class JabaIf3 {

	public static void main(String[] args) {
//주말과제		
		// 싸다구 주차장 주차비 결제
		// 주차장의 기본 요금은 1000원이고 기본 시간은 30분이다.
		// 11분 주차해도 1000원이다.
		// 10분당 100원씩 추가 요금
		// 34분 주차하면 1000원, 40분 주차하면 1100원
		// 51분 주차하면 1200원
		// 2시간이상 주차시 기본 요금은 1700원이다.
		// 2시간 10분 주차하면 1800원, 3시간 21분 주차하면 2500원
		// 4시간이상 주차시 기본요금은 2500원이다.
		// 4시간 15분 주차하면 2600원
		// 8시간 이상 주차시 무조건 10000원
		// 주차 몇시간 몇분 했는지 입력하여 주차요금이 얼마인지 출력해라
		
		Scanner sc = new Scanner(System.in);
		int default_time=30;
		int cost=1000;
		int pTime=0;
		int tenM=100;
		
		System.out.print("주차 시간(분) : ");
		pTime=sc.nextInt();
		
		if(0<pTime && pTime<=39) {
			System.out.println("주차 요금 : "+cost);
		} else {
			pTime=pTime-default_time;
			cost = (pTime/10)*tenM+cost;
			System.out.println("주차 요금 : "+cost);
		}		
	} 
}

