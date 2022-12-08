package step05oop.step03accessmodifier;

public class Mouse {
	private int age;
	private String name;

	// Alt + Shift + S -> Generate Constructor using Fields...
	public Mouse(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	// Alt + Shift + S -> Generate Getters and Setters...
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// 정렬 : Ctrl + Shift + F

}
