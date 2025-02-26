package Pay;

public class Card {

	public static void main(String[] args) {
	Creditcard creditcard = new Creditcard(10000, "2월 27일");	
	creditcard.processPay();	
	
	Checkcard checkcard = new Checkcard(40000, "2월 27일");
	checkcard.processPay();
	
	Cashpayment cashpayment = new Cashpayment(20000, "");
	cashpayment.processPay();
	
	Acounttransfer acounttransfer = new Acounttransfer(10000, "");
	acounttransfer.processPay();
	}
	

}
