package step05oop.step06poly.step02param;

public class Person {

	public void walk(Animal animal) {
		// 내부적으로 아래의 코드가 작성됨
		// Animal animal = new Dog("Spike");
		
		// 호출 시점(11번 라인)에서
		// new Cat()인지, new Dog()인지, new Animal()인지 알 수 없음
		
		// 타입명 instanceof 타입명 -> true / false
		if (animal instanceof Cat) {
			Cat c = (Cat)animal; // Cat c = new Dog();
			c.play();
		}
		
		if (animal instanceof Dog) {
			Dog d = (Dog)animal;
			d.play();
		}
		
		if (animal instanceof Animal) {
			System.out.println("참조변수의 주소값: " + animal.getClass().getName() + " 는 Animal 타입으로 형 변환 가능" );
		}
		
		if (animal instanceof Object) {
			System.out.println("참조변수의 주소값 : " + animal.getClass().getName() + " 는 Object 타입으로 형 변환 가능");
		}
		
	}

}
