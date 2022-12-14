package step05oop.step02constructor;

public class Mouse {
	// age, name을 필드로 가지고 있는 Mouse 클래스
	int age;
	String name;
	
	/**
	 * 생성자(Constructor) - 생성자 메서드
	 * new 연산자와 함께 사용되며, 어떤 객체(클래스)의 인스턴스를 만들 때 사용(호출)
	 * 
	 * 생성자 작성 규칙
	 * 1. 별도의 반환 타입이 없음(내부적으로 void가 동작)
	 * 2. 생성자 메서드의 이름은 클래스의 이름과 동일(대문자까지 동일하게, Case Sensitive)
	 * 3. 복수의 생성자를 작성할 수 있음(Overloading)
	 * -> 3-1. 생성자 오버로딩(Constructor Overloading)
	 * -> 메서드의 이름은 동일하고, 매개변수의 개수 or 타입, 작성 순서가 다를 경우 중복해서 작성 가능
	 * 
	 */
	
	public Mouse() {} // 매개변수가 없음
	public Mouse(int age) { this.age = age; } // 매개변수가 1개(개수가 다름)
	public Mouse(int age, String name) { // 매개변수가 2개, 타입 및 작성 순서: int, String
		this.age = age;
		this.name = name;
	}
	public Mouse(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public Mouse(String name) {
		this.name = name;
	}
	// 일반 메서드도 오버로딩 가능(문법적으로 가능)
	// 두 수의 합이 정수 타입인 값을 반환하는 메서드 add(int a, int b)
	public int add(int a, int b) {
		return a + b;
	}
	
	// 두 수의 합이 정수 타입인 값을 반환하는 메서드 add(int x, int y)
//	public int add(int x, int y) {
//		return x + y;
//	}
	// f(x) = y, f(a) = b;는 같기 때문에
	
	public long add(int a, long b) {
		return a + b;
	}
}
