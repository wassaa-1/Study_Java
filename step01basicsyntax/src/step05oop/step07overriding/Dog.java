package step05oop.step07overriding;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		
	}
	
	@Override
	void sing() {
		System.out.println("멍멍!");
	}
}
