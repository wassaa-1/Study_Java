package step02datatypes;

public class Basic4CharType {

	public static void main(String[] args) {
		// 4. 문자 타입 char
		
		// 4-1. 문자를 담을 때 사용, 한 글자의 문자만 저장할 수 있음.
		char a = 'A';
		
//		char b = "AB"; // Invalid character constant
		// Too many characters in character literal
		
		// 4-2. 문자 리터럴과 문자열 리터럴
		 /*
        문자와 문자'열'은 서로 다르다.
        char : Character, 문자의 줄임표현, 홑 따옴표('')사용, 하나의 문자만 감쌀 때 사용하는 Java 키워드
        String : String, 끈을 의미, 하나의 문자가 연속적으로 나열되어있다는 의미, 쌍 따옴표("") 사용,
                 두 개 이상의 문자를 사용할 때 쓰는 Java 키워드
		  */
		
		// 4-2. 공백 값(Blank value), 빈 문자열(Empty String)
		String emptyString = ""; // 문자열 리터럴 ""은 아무런 값도 없이 비어있는 문자열 작성 시 사용
		char blankValue = ' ';
		
		// 4-4. 문자열 결합(String 'concat'enation)
		String orange = "orange";
		String cookie = "cookie";
		
		String orangeCookie = orange + cookie; // 문자열 + 문자열의 연산 결과는 문자열타입
		
		String sixSigma = 6 + "sigma"; // 숫자 리터럴 + 문자열의 연산 결과는 문자열 타입
		String surpise = true + "혹은 거짓"; // 논리 리터럴 + 문자열 = 문자열
		
		// 변수 생성 없이 리터럴만으로 결과 확인
		System.out.println(5 + "5"); // 55
	}

}
