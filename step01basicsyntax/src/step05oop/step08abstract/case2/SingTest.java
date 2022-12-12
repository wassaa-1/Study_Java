package step05oop.step08abstract.case2;

public class SingTest {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
	
		animals[0] = new Cat();
		animals[1] = new Mouse();
		animals[2] = new Dog();
//		animals[3] = new Animal(); // 추상 클래스이기 때문에 인스턴스화 불가능
		// Cannot instantiate(인스턴스화) the type Animal

		for (Animal animal : animals) {
			animal.sing();
		}
	}

}

class Mouse extends Animal {
	// The type Mouse must implement the inherited abstract method Animal.sing()
	// -> Mouse 타입은 무조건 구현해야 한다. 상속받은 메서드인 Animal.sing()를
	/**
	 * 상속을 받기로한 상위 클래스(Animal)이 일반 클래스가 아니라 추상 클래스일 경우(class 앞에 abstract 키워드가 붙은),
	 * 하위 클래스는 해당 추상 클래스가 가지고 있는 추상 메서드를 무조건 구현해야함
	 */
	void sing () {
		System.out.println("찍찍");
	}
}

class Cat extends Animal {
	void sing() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void sing() {
		System.out.println("멍멍");
	}
}