package step05oop.step07overriding;

public class Mouse extends Animal {
	public Mouse() {
		super();
	}

	public Mouse(String name) {
		super(name);
	}

	String address;

	// 오버라이딩 (재정의) (다른 클래스의 메소드에 덮어쓰기)
	@Override
	public void showName() {
		System.out.println("내 이름은 비밀이야");
	}
	
	// 오버로딩 (중복정의) (같은 클래스의 메소드에 다른 매개변수 리스트 및 작성순서로 덮어쓰기)
	public void showName(String yourName) {
		System.out.printf("%s야 안녕? 나는 %s야 \n", yourName, name);
	}
	
	@Override
	void sing() {
		System.out.println("찍!");
	}
}
