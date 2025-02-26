package Pay;

public class Checkcard extends PayDate {
	
	public Checkcard(int a, String p) {
		super(a, p);
	}
	
	@Override
	public void processPay() {
		System.out.println("체크카드 결제금액은 "+acount+" 결제일은 "+paydate);
	};
}
