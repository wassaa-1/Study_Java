package step06exception;

public class MethodEx1 {

	public static void main(String[] args) throws Exception {
		method1();
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception { // method2()는 예외를 떠넘긴다. method2()를 호출한 곳으로(호출부로)
		throw new Exception(); // 예외 발생시켜 
		// Unhandled exception type Exception
	}

}
