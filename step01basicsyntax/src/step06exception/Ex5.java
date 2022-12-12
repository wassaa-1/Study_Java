package step06exception;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); // 수행되지 않음
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace(); // stackframe에 있는 메서드들을 순차적으로 추적
			System.out.println(e.getMessage()); // 발생한 예외의 메시지만 출력
		}
		System.out.println(5);
	}

}
