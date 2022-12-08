package step02datatypes;

public class Basic {

	public static void main(String[] args) {
		// 1. 값의 타입(Data types)
	
		// 1-1. 대표적인 기본(Primitive,원시) 타입
		int apples = 7;
		float eyesight = 1.5f; // Type mismatch: cannot convert from double to float
		char initialLetter = 'Y'; // 단 한글자의 '문자' 타입, 홑따옴표만 가능
		String name = "Yoo"; // 두 글자 이상의 문자'열' 타입, 쌍따옴표만 가능
		boolean isChecked = true;
		
		// 1-2. 각각의 값들을 출력
		System.out.println(apples);
		System.out.println(eyesight);
		System.out.println(initialLetter);
		System.out.println(name);
		System.out.println(isChecked);
	}

}
