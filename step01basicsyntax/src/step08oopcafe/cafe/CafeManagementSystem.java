package step08oopcafe.cafe;

import java.time.LocalDateTime;
import java.util.List;

import step08oopcafe.cafe.bar.Recipe;
import step08oopcafe.cafe.hall.Customer;
import step08oopcafe.cafe.hall.Menu;
import step08oopcafe.cafe.hall.MenuItem;
import step08oopcafe.cafe.hall.OrderInfo;
import step08oopcafe.cafe.hall.Receipt;
import step08oopcafe.common.Employee;
import step08oopcafe.common.Person;

// Staff와 Barista가 활용할 수 있는 전산 PC
/**
 * 카페의 DB
 * 유틸(Util) 클래스
 */
public class CafeManagementSystem {
	
	// 사용자 닉네임으로 사용자 정보 조회
	public static Customer findCustomerByNickName(Person isWho, String nickName) {
		if(authenticateUser(isWho)) {
			List<Customer> customers = CafeManager.getInstance().getCustomers();
			for (Customer customer : customers) {
				if (customer.getNickName().equals(nickName)) {
					return customer;
				}
			}
		}
		return null;
	}
	
	// 바리스타가 레시피 조회 findRecipeByDrinkName
	public static Recipe findRecipeByDrinkName(Person isWho, String drinkName) {
		if(authenticateUser(isWho)) {
			List<Recipe> recipes = CafeManager.getInstance().getRecipes();
			
			for (Recipe recipe : recipes) {
				if(recipe.getName().equals(drinkName)) return recipe;
			}
		}
		return null;
	}
	
	// 거스름돈 연산
	public static int calculateChange(Person isWho, String drinkName, int charge) {
		if(authenticateUser(isWho)) {
			// Menu에서 drinkName과 일치하는 음료 조회
			Menu menu = CafeManager.getInstance().getMenu();
			List<MenuItem> menuList = menu.getMenuList();
			for (MenuItem menuItem : menuList) {
				if(menuItem.getName().equals(drinkName)) {
					int change = charge - menuItem.getPrice();
					return change;
				}
			}
		}
		return 0; // TODO: 추후 예외처리 적용
	}
	
	
	
	
	// Staff가 주문 내역에 대한 영수증 출력
	public static Receipt printReceipt(Person isWho, LocalDateTime now, OrderInfo orderInfo) {
		if(authenticateUser(isWho)) return new Receipt(now, orderInfo);
		return null;
	}
	
	
	private static boolean authenticateUser(Person isWho) {
		if (isWho instanceof Employee) {
			return true;
		} else {
			return false;
		}
	}
}










