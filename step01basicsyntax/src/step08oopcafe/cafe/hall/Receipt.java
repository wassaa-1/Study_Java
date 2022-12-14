package step08oopcafe.cafe.hall;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 영수증(Receipt) 클래스 
 * 1. 거래 날짜 - LocalDateTime transactionDate; 
 * 2. 주문 정보 - OrderInfo orderInfo;
 *
 */
@AllArgsConstructor
@Getter
@ToString
public class Receipt {
	private LocalDateTime transactionDate;
	private OrderInfo orderInfo;
}
