package step06exception;

public class Ex2 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
			result = number / (int)(Math.random() *10);
			System.out.println(result);
			} catch(ArithmeticException exception) {
				System.out.println("0으로 나누면 안됩니다.");
			}
		}
	}
}
