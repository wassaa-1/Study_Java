package step08oopcafe.cafe.hall;

import java.util.List;

/**
 * 카페 메뉴 클래스
 * Field Summary
 * 1. 메뉴 제목 - String title;
 * 2. 메뉴 아이템 - List<MenuItem> menuList;
 *
 */
public class Menu {
	private String title;
	private List<MenuItem> menuList;
	
	public Menu(String title, List<MenuItem> menuList) {
		super();
		this.title = title;
		this.menuList = menuList;
	}
	
	
}
