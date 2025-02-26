package Pay;

public class Acounttransfer extends PayDate {// 이체
	public Acounttransfer(int a, String p) {
		super(a, p);
	}
	
	@Override
	public void processPay() {
		System.out.println("계좌이체로 "+acount+"원을 보냅니다.");
	};
}
