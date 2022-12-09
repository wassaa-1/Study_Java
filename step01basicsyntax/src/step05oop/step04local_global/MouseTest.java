package step05oop.step04local_global;
	
public class MouseTest {
	
	public static void main(String[] args) {
		System.out.println(Mouse.countOfTail);
		// static 키워드가 있는 멤버는 프로그램 동작 시 바로 메모리에 등록되기 때문에
		// 인스턴스를 생성하기 전 부터 사용이 가능함
		
		Mouse jerry = new Mouse();
		System.out.println(jerry.countOfTail);
		// -> Warning: The static field Mouse.countOfTail should be accessed in a static way
		
		Mouse mickey = new Mouse();
		mickey.countOfTail = 2;
		
		System.out.println(jerry.countOfTail);
		
	}
	
}	
	