package step08oopcafe;

import step08oopcafe.cafe.CafeManager;
import step08oopcafe.cafe.hall.Customer;

/**
 * 일반적인 흐름
 * 손님이 매장에 방문한다. - 손님(Customer) 객체 생성
 * 손님이 메뉴를 읽는다. - 메뉴 조회
 * 손님이 음료를 주문한다. - Customer - Staff 간 Messaging(협력)
 * 	- 음료 주문 시, 음료의 이름, 금액을 지불한다.
 * Staff는 주문 받은 주문서(Order)를 Barista에게 넘긴다. - Staff - Barista 간 협력
 * Barista는 주문서(주문 정보)를 보고 음료를 제조한다.
 * 음료가 제조되면 Barista는 음료를 Staff에게 전달한다.
 * Staff는 Customer에게 음료와 쟁반, 영수증 등을 준비해서 최종 상품으로 서빙한다.
 * 
 * 손님이 음료 마시고 끝.
 * 
 * 
 */
public class CafeApplication {

	public static void main(String[] args) {
		// 카페 매장
		// CafeApplication을 실행하는 건 매장 오픈
		
		System.out.println(CafeManager.getInstance());
	}

}
