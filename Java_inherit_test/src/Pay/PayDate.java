package Pay;

public abstract class PayDate {
	protected int acount; // 금액
	protected String paydate; // 결제일
	
	protected PayDate() {}
	public PayDate(int a, String p) {
		this.acount=a;
		this.paydate=p;
	}
	
	public abstract void processPay();
}
