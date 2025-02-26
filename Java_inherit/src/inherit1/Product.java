package inherit1;

public class Product { // 부모클래스
	protected boolean onOff=false;
	protected String brand; // 브랜드
	protected int price; // 가격
	protected String name; // 제품명 - LG휘센, 캐리어A32 등
	
	public Product() {
		System.out.println("부모클래스 생성");
	}
	public Product(String brand, int price, String name) {
		this.brand = brand;
		this.price = price;
		this.name = name;
	}
	public void power() {
		onOff=!onOff;
		System.out.println("전원 : "+onOff);
	}
}
