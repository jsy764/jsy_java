package customer;

import store.Banana;
import store.Fruit;
import store.Grape;

public class MainMethod {

	public static void main(String[] args) {
		// 바나나와 포도, 오렌지 갯수가 많이 필요하다면???
		// 바나나 - 15개, 포도 - 6개, 오렌지 - 54개
		// 망고, 수박, 토마토 등등등
//		Banana[] ba = new Banana[15];
//		
////		ba[0].makeJuice(); 아직 banana객체가 없기에 null이기에 오류 
//		
//		ba[0] = new Banana(2500, 500);
//		ba[1] = new Banana(3500, 500);
//		ba[2] = new Banana(5200, 500);
//		ba[3] = new Banana(5200, 500);
//		
//		ba[0].makeJuice();
		
		// 다형성 - 하나의 타입으로 여러 타입을 다룰 수 있다.
		// 상속 관계, Implements
		
		Fruit f = new Banana(2500, 500);
		f.makeJuice();
		Fruit g = new Grape(3500, 400);
		g.makeJuice();
	}

}
