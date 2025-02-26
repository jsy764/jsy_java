package Pay;

public class Cashpayment extends PayDate {//현금결제
	public Cashpayment(int a, String p) {
		super(a, p);
	}
	
	@Override
	public void processPay() {
		System.out.println("현금결제는 총 "+acount+"입니다.");
	};
}
