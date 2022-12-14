package step05oop.step03accessmodifier;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1 = new Student();

		// 값을 설정하는 방법 1번째 - 필드에 직접 접근을 통한 설정 방식
		// stu1.name = "인찬휘";
		// The field Student.name is not visible
		// 필드로의 접근이 불가능해짐
		// 외부에서의 무분별한 값 수정이 불가능해짐
		
		// 값을 설정하는 방법 2번째 - 생성자를 통한 설정 방식
//		Student stu2 = new Student("인찬휘");
//		System.out.println(stu2.naming("김찬휘"));
		
		// 값을 설정하는 방법 3번째 - setter()를 통한 설정 방식
		Student stu3 = new Student("인찬휘");
		System.out.println(stu3);
		stu3.setName("유정호");
		
		stu3.setAge(30);
	}

}