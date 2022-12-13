package step07collection.basic;

import java.util.ArrayList;

public class ArrayListTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Mouse mini = new Mouse(10, "미니", "하와이", "구직중");
		Mouse mickey = new Mouse(25, "미키", "런던", "맨체스터 유나이티드");
		Mouse jay = new Mouse(15, "제이", "상하이", "텐센트");
		Mouse jerry = new Mouse(20, "제리", "도쿄", "라인");
		Mouse jamie = new Mouse(40, "제이미", "대한민국", "삼성");
		
		ArrayList<Mouse> mice = new ArrayList<>(); // ArrayList cannot be resolved to a type
		// ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		
		System.out.println(mice); // 비어있는 배열(가변 길이)
		
		mice.add(mini);
		mice.add(mickey);
		
		System.out.println("mice 리스트의 요소의 개수: " + mice.size());
		
		Mouse mouse = (Mouse)mice.get(1); // Type mismatch: cannot convert from Object to Mouse
		// 상위 타입 -> 하위 타입으로의 형 변환(명시적)
		// Returns the element at the specified position in this list.
		
		// 특정 요소 삭제
		mice.remove(0);// 삭제할 요소의 인덱스
		
		
	}

}