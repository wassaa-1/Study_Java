package step06exception;

public class Finally {

	public static void main(String[] args) {// 클래스 메서드
		method1();
	}
	
	public static void method1() {
		try {
			System.out.println("method1() called");
			System.out.println(0/0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 예외가 발생하든 발생하지 않든, 무조건 수행되는 블록
			System.out.println("method1()의 finally block 실행되었음");
		}
	}

}
