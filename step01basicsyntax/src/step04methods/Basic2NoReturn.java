package step04methods;

import java.util.Random;

public class Basic2NoReturn {

	public static void main(String[] args) {
		drinkMachine();
	}
	// 별도의 반환타입이 없을 경우에는 void 키워드를 사용한다.
	public static void drinkMachine() {
		// Ctrl + Shift + O
		Random random = new Random(); // Random 객체(인스턴스) 생성
		// 그 인스턴스를 random이라는 변수에 초기화
		int number = random.nextInt(2); // random 객체가 제공하는 nextInt() 메서드 활용
		
		if (number == 0) {
			System.out.println("현재 스프라이트의 재고가 없습니다.");
		} else if(number == 1) {
			System.out.println("현재 닥터페퍼의 재고가 없습니다.");
		}
	}

}
