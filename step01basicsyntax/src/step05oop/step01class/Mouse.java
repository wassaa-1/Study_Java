package step05oop.step01class;

public class Mouse { // 쥐에 대한 설계도
	// 설계도 작성 부분
	
	// 쥐에 대한 속성(Field)과 행위(Method)를 기술
	
	// Member ? 어떤 클래스의 구성원
	
	// Field -> Member field
	int age; // 쥐의 나이 선언
	String name; // 쥐의 이름
	String country; // 국적
	String religion; // 종교
	String address; // 주소
	
	// Method -> Member method 
	void sing() {
		System.out.println("찍찍?!");
	}
	
	
	// 생성자 메서드, 반환 타입이 없음(void)
	
	// 기본 생성자(Default Constructor)
	public Mouse() {}
	
//	매개변수가 있는 생성자
	public Mouse(int age, String name, String country) {
		this.age = age; // The assignment to variable age has no effect
		this.name = name;
		this.country = country;
	}
}