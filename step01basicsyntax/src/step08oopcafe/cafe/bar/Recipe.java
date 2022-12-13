package step08oopcafe.cafe.bar;

import java.util.List;

/**
 * 바리스타가 이용하는 클래스
 * 
 * Field Summary
 * 0. 음료명 - String name;
 * 1. 음료를 제조하기 위한 재료 리스트 - List<String> materials
 * 2. 제조법 - String description
 */
public class Recipe {
	private String name;
	private List<String> materials;
	private String description;
	
	public Recipe(String name, List<String> materials, String description) {
		super();
		this.name = name;
		this.materials = materials;
		this.description = description;
	}
	
	
}
