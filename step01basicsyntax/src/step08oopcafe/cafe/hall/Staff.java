package step08oopcafe.cafe.hall;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import step08oopcafe.cafe.CafeManagementSystem;
import step08oopcafe.cafe.CafeManager;
import step08oopcafe.cafe.bar.Barista;
import step08oopcafe.cafe.bar.DrinkProduct;
import step08oopcafe.common.Employee;

/**
 * 스태프는 손님으로부터 주문을 받을 수 있음
 * 
 * Field Summary
 * 
 * Method Summary
 * 1. 손님으로부터 메뉴판을 전달하는 기능 - Menu showMenu()
 * 2. 손님으로부터 주문을 받음 - Product receiveOrder()
 * 	- 손님으로부터 금액, 메뉴 이름, 손님의 닉네임을 전달받음
 */
public class Staff extends Employee {

	public Menu showMenu() {
		return CafeManager.getInstance().getMenu();   
	}

	public Product receiveOrder(String nickName, String drinkName, int charge) {
		// 현재 주문 시간
		LocalDateTime currentTime = LocalDateTime.now();
		
//		currentTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
		// https://suyou.tistory.com/287
		System.out.println("현재 주문시간: " + currentTime);
		
		// 주문, 음료 제조 담당자 배정
		// TODO: 랜덤 배정
		Barista son = CafeManager.getInstance().getBaristas().get(0);
		
		// 담당 매니저들(managers) 배정
		List<Employee> managers = new ArrayList<>();
		managers.add(son); // 바리스타 추가
		managers.add(this); // 스태프 추가
		
		// 고객 정보 확인
		// nickName으로 고객 정보 조회
		Customer foundCustomer = CafeManagementSystem.findCustomerByNickName(this, nickName);
		CustomerInfo customerInfo = foundCustomer.getCustomerInfo();
		
		// 2. 거스름돈 연산
		int change = CafeManagementSystem.calculateChange(this, drinkName, charge);
		
		// 주문 정보(OrderInfo) 작성, OrderInfo는 Order 클래스의 구성 관계(Composition)로 작성됨
		OrderInfo orderInfo = new OrderInfo.Builder(drinkName, currentTime, managers, change)
								.setCustomerRequirement("아무렇게나 줘")
								.isTakeOut(true)
								.build();
		
		// 주문서(Order) 작성
		Order order = new Order(orderInfo, customerInfo);
		
		// 영수증 출력 - Receipt CafeManagementSystem.printReceipt(Person isWho, LocalDateTime now, orderInfo);
		Receipt receipt = CafeManagementSystem.printReceipt(this, currentTime, orderInfo);
		
		// 바리스타에게 전달
		DrinkProduct drinkProduct = son.dropTheDrink(order);
		
		// 스태프가 완성된 제품으로 구성
		Product product = new Product(drinkProduct, receipt, true);
		
		return product;
	}
	
}
