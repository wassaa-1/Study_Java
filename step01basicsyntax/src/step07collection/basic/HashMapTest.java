package step07collection.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장, 이름을 key값으로 해서 나이를 value로 저장
		map.put("V", 23);
		map.put("Jungkook", 23);
		map.put("Suga", 28);
		map.put("RM", 26);
		map.put("V", 25);

		System.out.println("총 Entry 수:" + map.size());

		// 객체 조회
		System.out.println("V: " + map.get("V")); // key로 value를 조회

		// 객체를 하나씩 처리.
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();

		// 객체 삭제
		map.remove("Suga"); // key값으로 제거
		System.out.println("총 Entry 수: " + map.size());
		
		// 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());

	}

}
