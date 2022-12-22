package step01java8feature.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic {

	public static void main(String[] args) {
		// 사과 객체 3개 생성하여 inventory라는 변수명으로 List(Apple 타입만 받을 수 있는) 생성
		// 리스트에 사과 추가
		
		// 1번째 사과: 무게가 80, color는 green
		// 2번째 사과: 무게가 155, color는 green
		// 3번째 사과: 무게는 120, color는 red
		List<Apple> inventory = Arrays.asList(
				new Apple(80, Color.GREEN),
				new Apple(155, Color.GREEN),
				new Apple(120, Color.RED)
		);
		
		System.out.println(filterApplesByColor(inventory, Color.RED));
		filterApples(inventory, Color.RED, 150, false);
		
		filter(inventory, new AppleGreenColorPredicate());
		
		// 이것도 가능
//		filter(inventory, new ApplePredicate() {
//			public boolean predicate(Apple apple) { return Color.RED.equals(apple.getColor()); }
//		});
		
//		filter(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));
//		});
		
		
		
	}
	

	public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color){
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getColor().equals(color)) {
				result.add(apple);
			}
		}
		return result;
	}

	// flag: 사과의 유통기한이 지났는가?
	public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if(apple.getColor().equals(color) || apple.getWeight() > weight || flag) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static List<Apple> filter(List<Apple> inventory, ApplePredicate predicator) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (predicator.predicate(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
}
