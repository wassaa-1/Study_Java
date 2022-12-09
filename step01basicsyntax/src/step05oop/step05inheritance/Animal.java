package step05oop.step05inheritance;

public class Animal {
	private int age;
	private String color;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Animal() {
		super();
	}

	public Animal(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}

	public String sing() {
		return "동물은 어떻게 울지?";
	}
}