package step03condition;

public class Basic5Switch {

	public static void main(String[] args) {
		String fruit = "apple";
		String colorOfFruit = "";
		switch(fruit) {
			case "apple":
				colorOfFruit = "red";
				break;
			case "banana":
				colorOfFruit = "yellow";
				break;
			default:
				colorOfFruit = "unknown";
				break;
		}
		System.out.println(colorOfFruit);
	}

}
