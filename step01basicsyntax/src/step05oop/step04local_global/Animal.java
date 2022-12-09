package step05oop.step04local_global;

public class Animal {
	int age; // 인스턴스 변수
	static String kind; // 전역변수 중에서도 static(정적, 클래스) 변수
	
	void instanceMethod() {// 인스턴스 메서드
		System.out.println(age);
//		인스턴스 메서드가 호출된다는 것은 객체가 이미 생성되었다는 의미이기 때문에 인스턴스 변수인 age 역시 사용 가능
		
		System.out.println(kind); // static 변수는 항상 인스턴스보다 먼저 메모리에 세팅(로딩)되기 때문에 사용 가능 
		
	} 
	static void staticMethod() { // 클래스 메서드
//		System.out.println(age);
		// -> Cannot make a static reference to the non-static field 'age'
		/*
		 * static에 staticMethod가 올라갈 시점에는
		 * 인스턴스가 생성되지 않았을 수 있기 때문에 사용 불가능
		 */
		
		System.out.println(kind);
//		instanceMethod(); // age와 마찬가지
		
		// 만약 여기서 객체(인스턴스)를 생성한다면?
//		Animal a = new Animal(); // 인스턴스가 생성
//		System.out.println(a.age);
		
	} 
}


