package step08oopcafe.cafe.hall;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import step08oopcafe.cafe.bar.DrinkProduct;

/**
 * 손님에게 제공되는 최종 상품 클래스
 * 스태프, 고객이 이용할 수 있는 클래스
 * 
 * Field Summary
 * 1. 제조된 음료 - DrinkProduct drinkProduct
 * 2. 영수증 - Recipt recipt
 * 3. 쟁반 제공 여부 - boolean isServedWithTray
 *
 */
@AllArgsConstructor
@ToString
@Getter
public class Product {
	private DrinkProduct drinkProduct;
	private Receipt recipt;
	private boolean isServedWithTray;
}
