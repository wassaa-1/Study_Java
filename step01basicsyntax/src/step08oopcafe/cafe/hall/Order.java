package step08oopcafe.cafe.hall;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * 주문서(Order) 클래스
 * Field Summary
 * 1. 주문 정보 - OrderInfo orderInfo
 * 2. 주문 고객 정보 - CustomerInfo customerInfo
 *
 */
@Getter
@AllArgsConstructor
public class Order {
	private OrderInfo orderInfo;
	private CustomerInfo customerInfo;
}
