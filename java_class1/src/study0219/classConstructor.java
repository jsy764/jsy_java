package study0219;

public class classConstructor {

	public static void main(String[] args) {
		
		Food f1 = new Food("돈가스", 8000);
		
		System.out.println(f1.foodName);
		
		Food f2 = new Food();
// 기본생성자 메서드가 존재하기에 Food() 실행됨
		
	}

}
