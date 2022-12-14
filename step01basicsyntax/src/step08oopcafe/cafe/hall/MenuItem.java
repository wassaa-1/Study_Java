package step08oopcafe.cafe.hall;

import lombok.Getter;
import lombok.ToString;

/**
 * Menu에 포함되는 항목 클래스
 * 
 * Field Summary
 * 1. 음료 이름 - String name
 * 2. 가격 - int price
 * 3. 준비 시간 - int preparingTime
 * 4. 인기도 - popular
 *
 */
@ToString
@Getter
public class MenuItem {
	private String name;
	private int price;
	private int preparingTime;
	private int popular;
	
	public MenuItem(String name, int price, int preparingTime, int popular) {
		super();
		this.name = name;
		this.price = price;
		this.preparingTime = preparingTime;
		this.popular = popular;
	}
	
}
