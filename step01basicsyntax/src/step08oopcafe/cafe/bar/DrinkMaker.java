package step08oopcafe.cafe.bar;

/**
 * 
 * 음료(Drink)를 만들어주는 기계(Factory) 
 *
 * Method Summary
 * 1. 음료 제조 - Drink dropDrink(Recipe recipe)
 * 
 * 
 * 팩토리 메서드 패턴
 * 객체의 생성과 사용을 분리하는 패턴
 */
public class DrinkMaker {
	Drink dropDrink(Recipe recipe) {
		return Drink.builder().name(recipe.getName()).recipe(recipe).build();
//		return new Drink(recipe.getName(), recipe);
	}
}
