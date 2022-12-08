package step02datatypes;

public class Basic2IntegerType {

	public static void main(String[] args) {
		// 2. 정수형(양의 정수, 0, 음의 정수)
		
		// 2-1. 정수형 타입의 종류, 왼쪽부터 값을 담을 수 있는 크기가 작음
		// byte, short, int(주로 사용, 사용 권장), long
		
		byte a = 127; // 허용 범위: -128 ~ 127, 2의 8제곱(256)
		short b = -32768; // 허용되는 가장 작은 값 할당, 허용범위: -32768 ~ 32767
		int c = 0; // 0 할당, 허용범위: 약 20억, 정수형을 사용할 때 주로, 기본으로 사용하는 타입
		long d = 20000000000L; // 허용 범위가 2의 약 63제곱
		// 2의 63제곱이면 200억은 허용을 해야하는데, 에러 발생
		
		long e = 20_000_000_000L; // Java7 버전부터 리터럴 중간에 구분자_(Underscore) 작성 가능
		// -> 가독성 향상
		
		
	}

}
