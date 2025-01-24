package study0123;

public class JavaBitOp {

	public static void main(String[] args) {
		// 비트 논리 연산자
		System.out.println(27 & 13); // and 연산
		System.out.println(27 | 13); // or 연산
		System.out.println(27 ^ 13); // xor연산
		System.out.println( ~13 ); // not 연산
		
		//비트 쉬프트 연산자
		System.out.println( 21<<2 ); // << 시프트 연산자
		System.out.println( 17>>3 ); // >> 시프트 연산자
	}
}
