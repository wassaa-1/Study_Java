package step05oop.step07overriding;

public class MouseTest {

	public static void main(String[] args) {
		Animal anAnimal = new Animal();
		anAnimal.name = "어떤 동물";

		anAnimal.showName();
		
		Mouse jerry = new Mouse();
		jerry.name = "제리";
		jerry.address = "하와이";
		
		jerry.showName();
		jerry.showName("Tom");
		
		// 오버라이딩과 다형성
		
		// Java에서 배열(Array)는 같은 타입의 값들만 담을 수 있음
		int[] numbers = new int[4]; // 길이가 4인 배열 생성
		numbers[0] = 1;
		numbers[1] = 2;
//		numbers[2] = "문자열";   // Type missmatch
		
		Animal[] animals = new Animal[4];
		Cat tom = new Cat("톰");  // Ctrl + Shift + O
		animals[0] = tom;
		animals[1] = new Dog("스파이크");
		animals[2] = new Mouse("제리");
		animals[3] = new Animal("동물");
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].sing();
		}
		
		for (Animal animal : animals) {
			animal.sing();
		}
	}
	
}
