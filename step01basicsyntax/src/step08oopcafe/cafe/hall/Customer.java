package step08oopcafe.cafe.hall;

import java.util.Scanner;

import step08oopcafe.common.Person;

/**
 * 고객은 음료(Drink)를 주문할 수 있음
 * 고객은 음료 주문시 금액을 결제, 지불해야함
 * 자신이 가진 금액보다 높은 금액의 음료는 주문 불가능(미구현)
 * 고객이 음료를 마시면 음료는 줄어듦(미구현)
 * 
 * Field Summary
 * 1. 카페에서 사용할 주문용 닉네임 - String nickName;
 * 2. 카페에서 사용할 금액 - int balance;
 * 3. 사용자 메타 정보 - CustomerInfo customerInfo;
 * 
 * Method Summary
 * 1. 메뉴 보기 - Menu checkMenu()
 * 2. 메뉴 결정, 스태프에게 음료 주문 및 결제 - void confirmMenu()
 */
public class Customer extends Person {
	private String nickName;
	private int balance;
	private CustomerInfo customerInfo;
	
	public Customer(String nickName, CustomerInfo customerInfo, int balance) {
		super();
		this.nickName = nickName;
		this.balance = balance;
		this.customerInfo = customerInfo;
	}

	// 아무 접근 제어자도 작성하지 않았기 때문에 package-private(default), 같은 패키지 내에서만 접근 가능
	void checkMenu() {
		Scanner sc = new Scanner(System.in); // Python의 input()과 동일
		
		// 주문을 받을 스태프 배정
		Staff staff = new Staff();
		
		System.out.print("메뉴판이 필요하시면 1번 선택, 아니면 바로 주문 간다 ㅇㅋ? -> ");
		int isMenuNeeded = sc.nextInt(); // 정수값을 받는 input() 기능
		
		if(isMenuNeeded == 1) { // 메뉴판 제공
//			staff.showMenu();
		} else { // 바로 주문
			
		}
		
		
	}
	
	void confirmMenu() {}
}
