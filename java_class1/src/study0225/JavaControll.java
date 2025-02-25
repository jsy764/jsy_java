package study0225;

public class JavaControll {

	final void sum(int a, int b) {
		// 메서드에 final하면 오버라이딩이 안된다.
		// 오버로딩은 새로운 메서드를 정의하는 것이고 오버라이딩은 기존의 메서드를 내용만 재정의하는 것이다.
		// 그래서 final 붙어있는 메서드는 변경될 수 없기에 오버라이딩 불가
		System.out.println("내가 sum이다");
	}
	void sum(int a) {
		int tot = a+20;
		System.out.println("아니야 내가 sum이야");
	}
	
	public static void main(String[] args) {
		
		final int year = 2025; // year변수의 값 변경불가
		
	}

}

/*	
	자바 클래스 제어자
	final - 변하지 않는, 변경되지 않는 
		  변수, 메서드, 클래스
		  
	static - 클래스의 , 공통적인 이라는 의미로 사용된다.
			모든 객체(인스턴스)들이 공통으로 사용할 수 있는 변수 또는 메서드
			
	abstract - 추상적인
			클래스, 메서드 사용
		  	추상 메서드를 가지고 있는 클래스는 추상 클래스가 되어야한다.
		  	추상 클래스는 객체생성 불가
		  	
		  
	인스턴스변수 - 객체 생성시 생성되는 변수 또는 메서드
				 new 클래스명();
	
	클래스 변수 - static 제어자 붙는 변수 또는 메서드
			   프로그램 실행시 - 클래스 로드 하고나서
			   
	지역변수 - 메서드내부 변수, 제어문 내부 변수 -> { } 블럭 안에 선언하는 변수
			 메서드 제어문 호출시 할당되는 변수
			 
	
*/

