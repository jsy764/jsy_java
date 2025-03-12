package thread1;

public class MainMt {

	public static void main(String[] args) {
		
		MyThread th1 = new MyThread("장은호");
		th1.start();
		
		MyThread th2 = new MyThread("김명준");
		th2.start();
		
		for(int i=1; i<=10; i++) {
			System.out.println(i+"main메서드");
			try {
				Thread.sleep(1200);
			}catch(Exception e) {}
		}
	}

}

//스레드
/*
	프로세스란? - 운영체제 (윈도우같은거)에서 프로그램을 실행시키는 단위
		  운영체제에서 프로그램을 실행시키려면 관리가 필요하다.
		  운영체제에 의해서 프로그램이 실행 되는것이고 각 프로그램의 메모리는 운영체제로부터
		  할당받아 사용하게된다. 모든 프로세스는 고유한 아이디를 갖는다.
		  이런 아이디를 프로세스라고 한다.
		  
	스레드란?
		  프로세스의 명령처리 단위
		  
	원 스레드의 장점
		- 컴퓨터의 자원 소모 감소
		- 오류 관리, 디버깅이 쉽다.
		- 명령코드 실행에서 충돌 방지
		- 오류가 발생해도 예외처리가 쉽다.
	
	멀티 스레드 장점
		- cpu 코어 컨텍스트 스위칭 값 감소
		- 데이터 주고 받는것이 간단해짐
		- 응답 시간 단축
		- 네트워크 환경에 적합
		
	스레드의 생명 주기
	1. new(스레드 생성)
	2. runnable 상태(실행준비)
	3. running 상태(실행)
	  - wait, sleep, suspend에 걸리면
	   -> 대기 상태
	  - 대기 상태에서 resume, notify, sleep time up에 의해
	   -> 실행 준비 상태로 변경
	4. terminated 상태 (소멸)
*/