package step05oop.step06poly.step01class;

public class PolymorpTest {

	public static void main(String[] args) {
		// 상위(클래스) 타입의 참조변수로 하위(클래스) 타입의 인스턴스를 참조할 수 있음
		// 상위 타입의 참조변수로 하위타입의 인스턴스를 참조할 수 있음
		
		// 참조한다? -> 변수에 담겨있는 주소값을 가지고, 실제 인스턴스의 위치로 찾아간다.
		
//		Animal anAnimal = new Whale(); // 고래는 동물이다.
		// 상위 타입(Animal)의 참조변수(anAnimal)로 하위 타입의 인스턴스인(new Whale())을 참조하고 있음
		// long a = 50; // 정수형의 기본 타입인 int 값인 50이 범위가 더 넓은 long 타입으로 자동 형 변환이 이루어짐
		// 범위가 더 작은 곳에서 더 넓은 곳으로 가능
		
		// 참조 타입에서는 하위 타입에서 상위 타입으로 자동 형 변환됨
		// 하위 타입이 상위 타입으로 자동 형변환, 단 두 클래스가 서로 상속 관계일 경우에 한해서
		
		Animal anAnimal = new Animal();
		anAnimal.name = "Animal 타입";
		anAnimal.sing();
		
		Whale whale = new Whale();
		whale.name = "Whale 타입";
		
		whale.sing(); // 오버라이딩을 하지 않아서 상위 클래스의 메서드가 그대로 호출됨
		
		whale.swim();
		
		Animal animal2 = new Whale();
//		animal2.swim(); // The method swim() is undefined for the type Animal
		// 상위 타입(Animal)의 참조변수(animal2)로는 하위 타입(Whale)의 인스턴스의 멤버(swim()) 사용 불가
		
//		Whale w = new Animal(); // Type mismatch: cannot convert from Animal to Whale
	}

}
