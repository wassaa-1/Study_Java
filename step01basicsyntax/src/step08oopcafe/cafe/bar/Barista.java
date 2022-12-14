package step08oopcafe.cafe.bar;

import step08oopcafe.cafe.CafeManagementSystem;
import step08oopcafe.cafe.hall.Order;
import step08oopcafe.cafe.hall.OrderInfo;
import step08oopcafe.common.Employee;

/**
 * 
 * 바리스타는 스태프로부터 음료 주문 내역(Order)을 전달받고, 음료를 제조할 수 있음
 * 
 * Method Summary
 * 1. 음료를 제조함 - DrinkProduct dropTheDrink(Order order)
 *
 */
public class Barista extends Employee {
	private int age;
	private String name;
	
	public DrinkProduct dropTheDrink(Order order) {
		
		// Drink 제조
		OrderInfo orderInfo = order.getOrderInfo();
		
		// 주문받은 음료이름 확인
		String drinkName = orderInfo.getDrinkName();
		
		// 카페 시스템에서 음료 레시피 조회
		Recipe foundRecipe = CafeManagementSystem.findRecipeByDrinkName(this, drinkName);
		
		// DrinkMaker를 사용해서 음료 내리기(Barista가 직접 생성하지 않고, 사용은 하고 있음)
		DrinkMaker drinkMaker = new DrinkMaker();
		Drink droppedDrink = drinkMaker.dropDrink(foundRecipe);
		
		// DrinkProduct 완성 후 반환
		Cup cupStyle = orderInfo.isTakeOut() ? Cup.PLASTIC : Cup.MUG;
		DrinkProduct drinkProduct = new DrinkProduct(cupStyle, droppedDrink, "잘 저어 마시쇼");
		
		return drinkProduct;
	}
}
