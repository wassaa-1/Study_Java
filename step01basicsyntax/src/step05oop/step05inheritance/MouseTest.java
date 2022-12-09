package step05oop.step05inheritance;

public class MouseTest {

	public static void main(String[] args) {
		Mouse jamie = new Mouse(2, "하늘색", "하와이");
		System.out.println(jamie.getColor());
		
		System.out.println(jamie.sing());
		
		System.out.println(jamie); // 내부적으로 toString()을 호출
		System.out.println(jamie.toString());
		
	}

}