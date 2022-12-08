package step05oop.step01class;

public class MouseTest {

	public static void main(String[] args) {
		// 내가 만든 세상
		// 어떤 클래스를 사용해서 그 클래스의 객체(인스턴스)를 생성하려면 new 연산자 사용
		// 객체의 생성: new 클래스명();
		// * "클래스는 '타입(type)'이다."
		Mouse jerry = new Mouse();
		System.out.println(jerry);
		
		jerry.sing();
		jerry.age = 2;
		System.out.println(jerry.age);
	}

}