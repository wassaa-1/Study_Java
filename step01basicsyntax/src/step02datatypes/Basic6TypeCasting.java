package step02datatypes;

public class Basic6TypeCasting {

	public static void main(String[] args) {
		// 값의 허용범위에 따른 값의 저장
		byte a = 120;
		int b = 120;
		long c = 120; // 리터럴 120은 현재 int 타입으로 변수 c의 long타입이 int의 허용 범위보다 넓기 때문에 저장 가능
		double d = 5.5F; // 마찬가지
		// 정리하면, 어떤 타입의 허용 범위가 작은 타입에서 큰 타입으로 값 저장이 가능

		// 리터럴의 타입이 담고자 하는 변수의 타입보다 허용 범위가 작은 경우
//		byte e = 130; // byte타입의 허용 범위를 초과하였기 때문에 불가능
		float f = 5.5f;
		
		// 예외적으로 byte나 short 타입은 별도의 리터럴 표기가 존재하지 않기 때문에
		// 허용 범위 내에서 정수형의 기본값인 int 타입의 리터럴로 저장 가능
		
		// 6. 타입 변환, 형 변환(Type casting)
		/*
		 * 서로 다른 타입 간의 연산을 수행하기 위해서는 먼저 타입을 일치시켜야함
		 * 변수 혹은 리터럴(value, 값)의 타입을 다른 타입으로 변환하는 것을 형 변환이라고 함
		 */
		
		// 6-1. 동일한 타입 간의 형 변환
		// Q. 15번 라인의 float f = 5.5;처럼 double타입인 리터럴 5.5를 float타입의 변수 f에 저장하기 위한 방법은 없을까?
        // 어차피 5.5는 float의 허용범위에 포함되는데..
		
		// 1번째 방법. double 타입의 리터럴 5.5 뒤에 접미사 f를 추가해서 애초에 float타입으로 작성한다.
		float g = 5.5f;
		
		// 2번째 방법. 형 변환을 활용하여 double 타입의 리터럴 5.5를 float 타입으로 변환(casting)한다.
		float h = (float)5.5; // 변환하고자 하는 리터럴 앞에 변환하고 싶은 타입을 명시(Explicit)해줌
		
		// 변수에 담겨있는 리터럴을 형변환하고자하는 경우에도 마찬가지
		double i = 5.5;
		
		float j = (float)i; // Type mismatch: cannot convert from double to float
		
		// 6-1-1. 타입의 범위를 초과하는 값을 강제로 형 변환하여 저장할 경우
		byte k = (byte)129;
		System.out.println(k); // -128, 오버플로
		
		// 6-2. 서로 다른 타입 간의 형 변환
		int l = (int)5.0f;
		
		// 6-2-1. 서로 다른 타입 간의 형 변환 과정에서 발생할 수 있는 값의 손실
		int m = (int)5.5f;
		System.out.println(m);
		
		// 6-3. 자동 형 변환(Implicit casting, 암묵적, 묵시적 형 변환)
		// 어떤 변수에 저장하고자 하는 리터럴(값)이 가질 수 있는 값의 범위가
		// 변수가 가진 타입보다 작을 경우 컴파일러가 자동으로 형 변환 코드를 작성해줌
		long n = 135; // 135는 int 타입이지만 long의 범위가 int보다 더 넓기 때문에 자동으로
		// long n = (long)135;로 작성됨
		
		float o = 100; // 서로 다른 타입이어도, 정수보다 실수가 값을 저장할 수 있는 범위가 더 크기 때문에 가능
		
		// boolean타입을 제외한 나머지 기본 타입들은 서로 형 변환이 가능
	}

}








