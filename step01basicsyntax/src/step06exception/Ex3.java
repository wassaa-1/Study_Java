package step06exception;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
