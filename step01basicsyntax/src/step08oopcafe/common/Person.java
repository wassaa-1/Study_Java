package step08oopcafe.common;

/**
 * 손님, 스태프, 바리스타, 사장 등 사람의 기본 필드를 구성하는 클래스
 * 
 * Field Summary
 * 1. 이름 - String name;
 * 2. 나이 - int age;
 * 3. 성별 - Gender gender;
 *
 * Method Summary
 * 1. 매장으로 들어온다. - getIn()
 * 2. 매장에서 나간다. - getOut()
 */
public class Person {
	private String name;
	private int age;
	private Gender gender;
	
	public void getIn(Person person) {
		System.out.println(person + "가 매장으로 들어왔다.");
	}
}
