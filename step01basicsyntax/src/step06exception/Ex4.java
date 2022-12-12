package step06exception;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0); // 예외가 발생하면 catch 블럭 내부로 이동하기 때문에
			System.out.println(4); // 실행되지 않음
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {
				System.out.println("ae는 ArithmeticException 클래스로 형 변환 가능");
			} if (ae instanceof Exception) {
				System.out.println("ae는 상위 클래스인 Exception 클래스로도 형 변환 가능");
			} if (ae instanceof Object) {
				System.out.println("ae는 Object 클래스로 형 변환 가능");
			}
		}// try-catch 끝
		System.out.println(6);
	}

}
