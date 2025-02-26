package Pay;

public class Creditcard extends PayDate {
	public Creditcard(int a, String p) {
		super(a, p);
	}
	
	@Override
	public void processPay() {
		System.out.println("신용카드 결제금액은 "+acount+" 결제일은 "+paydate);
	};
}
