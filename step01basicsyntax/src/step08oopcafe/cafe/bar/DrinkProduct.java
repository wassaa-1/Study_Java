package step08oopcafe.cafe.bar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 바리스타가 제조를 마친 음료 제품 클래스
 * 스태프에게 전달되는 음료 상품으로, 최종 상품인 Product의 구성 요소
 * 
 * Field Summary
 * 1. 제조된 음료 - Drink drink
 * 2. 음료 마시는 팁 - String drinkTip
 *
 */
@AllArgsConstructor
@ToString
@Getter
public class DrinkProduct {
	private Cup style;
	private Drink drink;
	private String drinkTip;
}
