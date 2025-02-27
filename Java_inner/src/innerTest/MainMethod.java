package innerTest;

public class MainMethod {

	public static void main(String[] args) {
		Tire tire = new Tire();
		tire.setInch(18);
		
		Car car = new Car(tire);
		
		System.out.println(car.getTire().getInch());
	}

}
/*



*/