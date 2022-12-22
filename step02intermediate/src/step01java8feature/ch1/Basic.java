package step01java8feature.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Basic {

	public static void main(String[] args) {
		// 사과 객체 3개 생성하여 inventory라는 변수명으로 List(Apple 타입만 받을 수 있는) 생성
		// 리스트에 사과 추가
		
		// 1번째 사과: 무게가 80, color는 green
		// 2번째 사과: 무게가 155, color는 green
		// 3번째 사과: 무게는 120, color는 red
		List<Apple> inventory = Arrays.asList(
				new Apple(80, "green"),
				new Apple(155, "green"),
				new Apple(120, "red")
		);
		
		// Java 8 이전 해결 방식
		// 초록색인 사과만 필터링하는 메서드, List<Apple> filterGreenApples(inventory) { }
		List<Apple> greenApples = filterGreenApples(inventory);
		System.out.println(greenApples); // 초록색인 사과만 출력되도록
		
		// 150g 이상의 사과만 필터링하는 메서드, List<Apple> filterHeavyApples(inventory) { }
		List<Apple> heavyApples = filterHeavyApples(inventory);
		System.out.println(heavyApples);
		
		// Java 8 이후 메서드 참조 방식을 통한 해결
		List<Apple> greenApples2 = filterApples(inventory, Basic::isGreenApple);
		List<Apple> heavyApples2 = filterApples(inventory, Basic::isHeavyApple);
		
		// Java 8 이후 람다(익명 함수)를 통한 해결
		List<Apple> greenApples3 = filterApples(inventory, (Apple apple) -> apple.getColor().equals("green"));
		List<Apple> heavyApples3 = filterApples(inventory, (Apple apple) -> apple.getWeight() > 150);
	}
	
	// 메서드 작성 부분
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		// 초록색 사과만 들어있는 새로운 사과 박스 생성
		List<Apple> greenAppleBox = new ArrayList<>();
		
		// 초록색, 빨간색 사과들이 섞여있는 inventory에서 필터링
		for (Apple apple : inventory) {
			if (apple.getColor().equals("green")) {
				greenAppleBox.add(apple);
			}
		}
		return greenAppleBox;
	}
	
	public static List<Apple> filterHeavyApples(List<Apple> inventory) {
		// 초록색 사과만 들어있는 새로운 사과 박스 생성
		List<Apple> heavyAppleBox = new ArrayList<>();
		
		// 초록색, 빨간색 사과들이 섞여있는 inventory에서 필터링
		for (Apple apple : inventory) {
			if (apple.getWeight() > 150) {
				heavyAppleBox.add(apple);
			}
		}
		return heavyAppleBox;
	}

	// Java 8 이후 메서드 참조 방식
	public static boolean isGreenApple(Apple apple) { return apple.getColor().equals("green"); }
	public static boolean isHeavyApple(Apple apple) { return apple.getWeight() > 150; }
	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p){
		List<Apple> result = new ArrayList<>();
		
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}






