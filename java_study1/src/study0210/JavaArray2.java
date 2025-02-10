package study0210;

import java.util.Scanner;

public class JavaArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 7개 정수를 저장할 수 있는 배열을 선언하고 정수 7개 입력한뒤 모두 출력해라.
//		int[] num = new int[7]; // 7의 크기의 배열(7개 공간) 선언
//		
//		for(int i=0; i<7; i++) {
//			System.out.print("숫자 입력 : ");
//			num[i]=sc.nextInt();
//		}
//		for(int i=0; i<7; i++) {
//			System.out.println(num[i]); 
//		}
		
//		final int size=10;
//				
//		int[] age = new int[size]; // 정적 배열은 지정된 크기를 변경하기 어렵다. 프로그램 실행 시 컴파일 과정에서 배열의 크기가 정해져 있어야 그만큼 공간을
//		// 할당 받는데 배열의 크기가 확정되어 있지않으면 컴파일 과정에서 공간을 할당받지 못한다. (윈도우에 의해 필요한 만큼 대여 받는건데 정확한 크기가 없으면 대여 안해줌.)
//		age[0]=10;
//		System.out.println(age[0]);
		
//		int[] sum = new int[3];
//		int[] a = new int[] {10,20,30};
//		int[] b = new int[] {1,5,9};
//		
//		// a 배열과 b배열의 합을 sum에 저장
//		sum[0] = a[0]+b[0];
//		sum[1] = a[1]+b[1];
//		sum[2] = a[2]+b[2];
//		
//		for(int i=0; i<sum.length; i++) {
//			sum[i] = a[i] + b[i];
//		}
		
		// a와 b배열의 데이터를 total 배열에 저장하고 a 배열의 값을 먼저 저장하고 이어서 b배열의 값을 저장될 수 있게한 후 total배열 값 출력
		// -> 10 20 30 40 50 55 44 33 22 11
//		int[] total = new int[10];
//		int[] a = new int[] {10, 20, 30, 40, 50};
//		int[] b = new int[] {55, 44, 33, 22, 11};
//		
//		for(int i=0 ; i<5; i++) {
//			total[i] = a[i];
//			total[i+5] = b[i];
//		}
//		for(int i=0; i<10; i++) {
//		System.out.printf("%d ", total[i]);
//		}
		
//		char[] name = new char[5];
//		name[0]='j';
//		name[1]='o';
//		name[2]='h';
//		name[3]='n';
//		// name -> john 문자로 저장
//		// 문자열은 배열이지만 char 배열로는 온전한 문자열 입력이 어렵다. 배열이기 때문에 인덱스를 통해 문자 하나씩 입력 저장 해야한다. 그래서 자바에서 문자열의 사용을 편하게 하기위해
//		// String 클래스가 존재한다. String 클래스에는 내부적으로 char 배열 생성 되도록 되어있다.
//		System.out.println(name);
//		System.out.println("member".length());
//		
//		String myName = "john"; // 객체변수
//		System.out.println(myName);
//		myName = "정수영";
//		System.out.println(myName.charAt(2));
//		
//		String youName = new String("박문수");
//		System.out.println(youName);
		
//		int[] a = new int[] {11, 20, 55};
//		int[] b = new int[] {13, 20, 55};
//		
//		boolean isSame = true; // 같은 배열이면 true, 다르면 false
//		
//		for(int i=0; i<a.length; i++) {
//			if(a[i] != b[i]) 
//				isSame=false;
//		}
//		if(isSame) {
//			System.out.println(" 같은 배열 ");
//		} else {
//			System.out.println(" 다른 배열 ");
//		}
		
//		char[] name1 = new char[] {'주', '동', '건'};
//		char[] name2 = new char[] {'장', '은', '호'};
//		boolean name = true;
//		// name1과 name2의 이름이 같은 이름인가???
//		for(int i=0; i<3; i++) {
//			if(name1[i] == name2[i]) 
//			// name= false;
//				name = true;
//			else
//				name = false;
//		}
//		if(name)
//			System.out.println("같은 이름");
//		else 
//			System.out.println("다른 이름");
		
		String name1 = "주동건";
		String name2 = "이동건";
		if(name1.equals(name2))
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		
		
		System.out.println(name1.compareTo(name2));
		// compareTo : 0 이라면 두 문자열 동일
		// 		양수 : 사전적 순서가 앞인 경우
		//		음수 : 사전적 순서가 뒤인 경우
		
		// 오늘의 과제는 랜덤 범위 1~50의 랜덤 숫자 중에서 짝수 15개를 배열에 저장하고 15개 전부 저장되면 배열을 출력해하. 슛자 중복은 상관없음
		
		int[] num = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		for(int a : num) {
			System.out.println(a);
		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
	}
}
