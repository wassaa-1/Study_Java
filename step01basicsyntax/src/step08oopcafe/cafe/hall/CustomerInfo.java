package step08oopcafe.cafe.hall;

import java.util.HashMap;

/**
 * 고객의 기본적인 정보를 포함하고 있는 클래스
 * Customer, Order의 필드로 포함됨
 *
 * Field Summary
 * 1. 이전 주문 기록 - List<String> orderHistory(Order에서 주문한 메뉴들만 리스팅)
 * 2. 매장 이용 횟수 - int visitCount
 *
 * Method Summary
 */

public class CustomerInfo {
    private HashMap<String, Integer> orderHistory; // 음료 별 횟수
    private int visitCount;
    
	public CustomerInfo(HashMap<String, Integer> orderHistory, int visitCount) {
		super();
		this.orderHistory = orderHistory;
		this.visitCount = visitCount;
	}
    
    
}