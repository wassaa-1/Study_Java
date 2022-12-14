package step04methods;

public class Basic {

	public static void main(String[] args) {
		// 1. Java에서는 함수 대신 메서드라는 용어를 사용함
		System.out.println(drinkMachine(1));

	}
	
	// Java에서는 메서드 이름 앞에 해당 메서드의 반환 타입을 명시해야함
	// public static 반환타입 메서드명(...파라미터) -> 함수(메서드) 선언부 
	// { 구현부, 몸체 }
	public static String drinkMachine(int number) {
		String drink = "";
		
		if (number == 1) {
			drink = "제로 콜라";
		} else if(number == 2) {
			drink = "스프라이트";
		}
		
		return drink;
	}

}