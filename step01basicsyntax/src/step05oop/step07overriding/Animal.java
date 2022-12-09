package step05oop.step07overriding;

public class Animal {
	String name;
	
	public void showName() {
		System.out.printf("나는 %s야 \n", name);
	}

	public Animal() {
		super();
	}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	void sing() {
		System.out.println("동물이 어떻게 울지");
	}
}
