package inherit1;

public class JavaInherit1 {

	public static void main(String[] args) {
		
		Tv tv = new Tv("삼성", 950000, "st60");
		Aircon air = new Aircon("캐리어", 542000, "ca18t");
		Computer com = new Computer("삼성", 1730000, "매직스테이션10");
		
		System.out.println(tv.brand);
		
		tv.power();
		air.power();
		com.power();
	}
}

/* 상속 - 클래스들의 관계를 부모-자식 관계로 설정한다.
 		부모클래스의 변수 또는 메서드를 자식 클래스에서 사용가능하다.
		여러 클래스들이 공통요소를 부모클래스로 구성한다.
		예) TV, 컴퓨터, 냉장고, 에어컨
		  전기(파워), 플러그, 가격, 브랜드, 등등등
		  가전제품 부모클래스에 파워, 가격, 브랜드를 정의한다.
		  
		다형성 - 다양한 형태
			TV t = new TV();
			Computer com = new Computer();
			
			가전제품 tv = new TV();
			가전제품 com = new Computer();
		  
	css에서 글자색을 red로 설정한다.
	<div id="a">
		<div class="b"></div>
		<ul class="c"></ul>
		<p class="d"></p>
	</div>
	
	#a{ color : red;}
	
	.b{color: red;} .c{color: red;} .d{color: red;}
	
	//과제
 		부모클래스 : 라면
 		변수 : 물, 스프, 면
 		메서드 : 물량조절, 타이머, on/off(불 키기/끄기)
 		자식클래스 : 짜파게티, 너구리, 진라면, 불닭볶음면
 		
 		부모클래스 : 자동차
 		변수 : 연료, 엔진, 헨들, 차키
 		메서드 : 속도조절, 방향조절, 시동 on/off, 차구동
		자식 클래스 : 승용차, 버스, suv, 트럭

*/