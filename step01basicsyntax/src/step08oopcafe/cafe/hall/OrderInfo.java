package step08oopcafe.cafe.hall;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import step08oopcafe.common.Employee;

/**
 * 주문 정보(OrderInfo) 클래스
 * 주문(Order) 클래스의 필드로 구성됨
 * 
 * Field Summary
 * 1. 주문 음료명 - String drinkName - 필수 필드
 * 2. 주문 날짜 - LocalDateTime orderDate - 필수 필드
 * 3. 주문 담당자 - List<Employee> managers - 필수 필드
 * 4. 테이크아웃 여부 - boolean takeOut; - 선택 필드
 * 5. 주문 요청 사항 - String customerRequirement - 선택 필드 
 */
@Getter
public class OrderInfo {
	
	private String drinkName;
	private LocalDateTime orderDate;
	private List<Employee> managers;
	private int change;
	private boolean takeOut;
	private String customerRequirement;
	
//	// 점층적 생성자 패턴
//	public OrderInfo(String drinkName) {
//		super();
//		this.drinkName = drinkName;
//	}
//
//	public OrderInfo(String drinkName, LocalDateTime orderDate) {
//		super();
//		this.drinkName = drinkName;
//		this.orderDate = orderDate;
//	}
//
//	public OrderInfo(String drinkName, LocalDateTime orderDate, List<Employee> managers) {
//		super();
//		this.drinkName = drinkName;
//		this.orderDate = orderDate;
//		this.managers = managers;
//	}
	
	private OrderInfo(Builder builder) {
		this.drinkName = builder.drinkName;
		this.change = builder.change;
		this.orderDate = builder.orderDate;
		this.managers = builder.managers;
		this.takeOut = builder.takeOut;
		this.customerRequirement = builder.customerRequirement;
	}
//	
//	// 빌더 패턴
	public static class Builder { // Builder: 만들어주는 사람
		
		// 필수 필드
		private String drinkName;
		private LocalDateTime orderDate;
		private List<Employee> managers;
		private int change;
		// 선택 필드
		private boolean takeOut;
		private String customerRequirement;
		
		// 필수 필드를 세팅해주는 생성자
		public Builder(String drinkName, LocalDateTime orderDate, List<Employee> managers, int change) {
			this.drinkName = drinkName;
			this.orderDate = orderDate;
			this.managers = managers;
			this.change = change;
		}
		
		// Builder 클래스 내부에 있는 일반 메서드, takeOut 필드의 값을 세팅
		public Builder isTakeOut(boolean takeOut) {
			this.takeOut = takeOut;
			return this;
		}
		
		public Builder setCustomerRequirement(String customerRequirement) {
			this.customerRequirement = customerRequirement;
			return this;
		}
		
		public OrderInfo build() {
			return new OrderInfo(this);
		}
	}
	
}









