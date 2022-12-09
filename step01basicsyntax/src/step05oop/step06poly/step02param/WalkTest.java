package step05oop.step06poly.step02param;

public class WalkTest {

	public static void main(String[] args) {
		Cat c = new Cat("Tom");
		Dog d = new Dog("Spike");
		
		Person p = new Person();
		
		p.walk(c);
		p.walk(d);
	}

}
