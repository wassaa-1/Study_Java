package step05oop.step07overriding;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
		
	}

	@Override
	void sing() {
		System.out.println("야옹~");
	}
	
	
}
