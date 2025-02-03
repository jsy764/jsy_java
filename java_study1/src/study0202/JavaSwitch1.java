package study0202;

public class JavaSwitch1 {
	public static void main(String[] args) {
//		switch(20) {
//			case 'a':
//				System.out.println("1을 선텍");
//			case 10:
//		}
//		switch(1) {
//		case 1:
//			System.out.println("1을 선택");
//			if() {
//				switch() {}
//			}
//			 switch() {}
//			break;
//		case 3:
//			System.out.println("3을 선택");
//			break;
//		case 10:
//			System.out.println("10을 선택");
//			break;
//		}
		
		int num = 50;
		switch(num) {
		case 10:
			System.out.println("10 선택");
			break;
		case 30:
			System.out.println("30 할꺼야??");
			break;
		case 20:
			System.out.println("case에 표현하는 데이터는 정수, 문자, 문자열");
			break;
		case 50:
			System.out.println("입력된 값에 맞는 case 실행은 "+"break 또는 } 까지 실행");
			break;
		default:
			System.out.println("case에 없는값이야!! 다시해!!");
		}
		
		int 점수=72;
		switch(점수/10) {
		case 10:
		case 9:	
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		default:
			System.out.println("F 학점");
		}
		
	}
}

/*
	가위바위보 게임 만들기
	1.가위 2.바위 3.보
	내가 이겼는지, 졌는지, 비겼는지 출력
*/

/*
 * if(점수 <=100 && 점수 >=90){
 * 		"A학점"
 * }else if(점수 >= 80) {
 * 		"B학점"
 * }
 */

	