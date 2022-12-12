package step05oop.step09interface.basic;

public class SharkTest {

	public static void main(String[] args) {
		Shark s = new Shark();
		
		if (s instanceof Unit) {
			System.out.println("s는 Unit 클래스의 하위 클래스 입니다.");
		}

		if (s instanceof Horrible) {
			System.out.println("s는 Horrible 인터페이스를 구현했습니다.");
		}
		
	}

}
