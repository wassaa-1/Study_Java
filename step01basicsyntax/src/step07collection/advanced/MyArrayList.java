package step07collection.advanced;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<T> implements List<T> {
	// List 인터페이스를 직접 구현할 구현 클래스 MyArrayList
	
	// 멤버 필드 중에서 인스턴스 변수
	private int size; // 요소의 개수를 추적하기 위한 필드 size
	private T[] array; // 실제로 요소를 저장하는 고정 길이 배열 array
	
	// 기본 생성자
	public MyArrayList() {
		array = (T[])new Object[10]; // 길이가 10인 Object 배열로 초기화, T[]로 명시적 형 변환
		size = 0; // 초기 사이즈 0, size: 실제로 들어있는 요소의 개수를 기준으로 함
	}
	
	@Override
	public String toString() {
		return "MyArrayList [size=" + size + ", array=" + Arrays.toString(array) + "]";
	}
	
	/**
	 * @return array에 들어있는 실제 요소의 개수(size)
	 */
	public int size() {
		return size;
	}
	
	/**
	 * @param element - 배열의 가장 뒷 부분에 추가할 요소(값)
	 */
	public boolean add(T element) {
		T[] temp = array;
		array = (T[])new Object[array.length+1];
		for (int i = 0; i < temp.length; i++) {
			array[i] = temp[i];
		}
		array[]
	}
}
