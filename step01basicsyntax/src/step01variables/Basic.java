package step01variables;

public class Basic {

	public static void main(String[] args) {
		// 1. 변수의 생성, 선언과 초기화로 이루어짐
		
		// 1-1. 변수의 선언
		int a;
		// 1-2. 변수의 초기화(Initialization)
		a = 5;
		
		// 선언과 초기화를 한줄로 작성
		int b = 10; // The value of the local variable b is not used
		
		// 2. 변수명 이름 짓기(Naming Convention)
		// 문법적으로 허용은 되나(컴파일 에러가 발생하지 않음), 일반적인 관례상 사용하지 않는 케이스들도 있음
		
		// 2-1. 영문자(대소문자)
		int alphabet = 26; // 변수는 소문자로 시작(camelCase)
		
		int Upper = 5; // 단순히 문법적으로 허용은 되지만, 변수명을 대문자로 시작하진 않음
		
		// 2-2. 특수문자($, _ 기호만 가능, !#@ 등은 불가능), 레거시 코드에서 주로 사용
		int $isLogin = 0;
		int _isLogin = 0;
		
		// 2-2. 숫자로 시작할 수 없음
//		int 5 = 5; // ?
		
		// 2-3. 키워드, 예약어 사용 불가(for, while, int, break 등)
//		int int = 5; // ??
	}

}










