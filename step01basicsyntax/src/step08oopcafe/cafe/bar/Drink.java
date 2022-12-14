package step08oopcafe.cafe.bar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * 
 * 바리스타가 이용할 수 있는 클래스
 * 음료 그 자체
 * 
 * Field Summary
 * 1. 음료 이름 - name
 * 2. 레시피 - Recipe recipe
 *
 */
@Builder
@ToString
@AllArgsConstructor
public class Drink {
	private String name;
	private Recipe recipe;
	
	
}
