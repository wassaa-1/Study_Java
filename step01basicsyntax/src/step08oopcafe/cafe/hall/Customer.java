package step08oopcafe.cafe.hall;

import java.util.Scanner;

import lombok.Getter;
import step08oopcafe.cafe.CafeManager;
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
@Getter
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
	public void checkMenu() {
		Scanner sc = new Scanner(System.in); // Python의 input()과 동일
		
		// 주문을 받을 스태프 배정
		// getStaffs() - List<Staff>
		Staff staff = CafeManager.getInstance().getStaffs().get(0);
		
		System.out.print("메뉴판이 필요하시면 1번 선택, 아니면 바로 주문 간다 ㅇㅋ? -> ");
		int isMenuNeeded = sc.nextInt(); // 정수값을 받는 input() 기능
		System.out.println(isMenuNeeded);
		
		if(isMenuNeeded == 1) { // 메뉴판 제공
			Menu menu = staff.showMenu();
			System.out.println(menu);
		}
		
		// 주문할 음료 선택
		System.out.print("주문할 음료를 말씀하세요(ex. 페퍼민트, 아이스 아메리카노) ->");
		sc.nextLine();
		String drink = sc.nextLine(); // 주문할 음료
		
		// 메뉴 주문을 위해, 현재 담당 스태프와 주문할 음료를 인수로 전달
		confirmMenu(staff, drink);
	}
	
	// 메뉴 결정하기
	private void confirmMenu(Staff staff, String drinkName) {
		// 스태프에게 음료 주문 및 결제, 음료 수령
		Product myProduct = staff.receiveOrder(nickName, drinkName, balance); // 스태프야 주문 받아
		System.out.println(myProduct);
		
		// 거스름돈 받고, 잔액에서 차감
		Receipt myReceipt = myProduct.getRecipt();
		int change = myReceipt.getOrderInfo().getChange();
		System.out.println("내 거스름돈" + change);
		balance -= change;
		
		// 바리스타가 적어준 음료 팁 확인
		String tip = myProduct.getDrinkProduct().getDrinkTip();
		System.out.println(tip);

		// 혹시 음료 레시피는? -> 레시피를 확인 못하게 하려면?
		System.out.println(myProduct.getDrinkProduct().getDrink());
		
		// 현재 잔액 확인(음료 비용만큼 금액이 잔액에서 잘 차감되었는지 확인)
		System.out.println("현재 잔액은 " + balance + "입니다.");
	}
}





