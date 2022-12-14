package step08oopcafe.cafe.hall;

import java.util.List;

import lombok.Getter;

/**
 * 카페 메뉴 클래스
 * Field Summary
 * 1. 메뉴 제목 - String title;
 * 2. 메뉴 아이템 - List<MenuItem> menuList;
 *
 */
@Getter
public class Menu {
	private String title;
	private List<MenuItem> menuList;
	
	public Menu(String title, List<MenuItem> menuList) {
		super();
		this.title = title;
		this.menuList = menuList;
	}

	@Override
	public String toString() {
		for (MenuItem menuItem : menuList) {
			System.out.println("음료명: " + menuItem.getName());
			System.out.println(menuItem);
		}
		return "결정되면 스태프에게 주문하세요";
	}
	
	
}
