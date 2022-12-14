package step05oop.step01class;

public class MouseTest2 {

	public static void main(String[] args) {
		// 변수명이 jerry인 Mouse 인스턴스(객체) 생성
		
		// Field 설정: age는 73, name은 "제리", address는 "뉴욕시"
		// color는 "갈색" -> 동적으로 필드 추가 불가, Mouse 클래스에 작성되어 있는 필드만 활용 가능
		
		int a = 5;
		String name = "Yoo";
		Mouse jerry = new Mouse();
		jerry.age = 73;
		jerry.name = "jerry";
		jerry.address = "뉴욕시";
		System.out.println(jerry);

		// 매개변수가 있는 생성자로 Mouse 객체 생성
		Mouse mickey = new Mouse(94, "미키마우스", "미국");
		System.out.println(mickey.age);
		
		System.out.println(jerry == mickey); // false
		// 주소값이 다르기 때문, 인스턴스는 고유하기 때문에
	}

}