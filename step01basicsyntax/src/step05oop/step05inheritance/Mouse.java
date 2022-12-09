package step05oop.step05inheritance;

public class Mouse extends Animal { // inheritance의 예약어: extends
	// Implicit super constructor Animal() is undefined for default constructor. 
	// Must define an explicit constructor
	
	/*
	 * extends 키워드를 써서 상속 관계를 형성하면 슈퍼 클래스(Animal)의 필드 & 메서드(특성)를 서브 클래스(Mouse)에서도
	 * 사용할 수 있다.(상위 - 하위 클래스)
	 * 눈에 보이지 않지만, 작성되어 있음
	 * 
	 */
	
	// 눈에 안보이는 코드
	// private int age;
	// private String color;
	
	private String address;
	
	// 매개변수를 다 받는 생성자
	public Mouse(int age, String color, String address) {
		// super() => Animal();
		super(age, color); // Animal(age, color);
		this.address = address;
	}

	
	// Alt + S -> Override... 클릭
	// Mouse가 자신만의 우는 방식을 새롭게 재정의(Override)
	@Override // -> Annotation(표기방식), 해당 메서드가 오버라이딩된 메서드임을 표시해준 것뿐, 주석 처리해도 동작에는 이상이 없음
	public String sing() {
		return "찍찍";
	}

	@Override
	public String toString() {
		return "Mouse [address=" + address + "]";
	}

//	@Override
//	public String toString() {
////		return "Mouse" + getColor() + "[address=" + address + "]";
//		
//		return "Mouse " + super.toString() + "[address = " + address + "]";
//	}
	
	

	
	
	
}