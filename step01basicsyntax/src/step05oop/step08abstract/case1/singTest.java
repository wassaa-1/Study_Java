package step05oop.step08abstract.case1;

public class singTest {

	public static void main(String[] args) {
		// 다형성 개념, forEach 활용, sing() 호출
		Animal[] animals = { new Cat(), new Mouse(), new Dog(), new Animal() };

		for (Animal animal : animals) {
			animal.sing();
		}

	}

}

class Mouse extends Animal {
	void sing() {
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