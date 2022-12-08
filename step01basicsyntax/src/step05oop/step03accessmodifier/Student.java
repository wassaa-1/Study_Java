package step05oop.step03accessmodifier;


// protected, default
public class Student {
	int id;
	private String name;
	int grade;
	String address;
	int age;
	
	public Student() {}
		
	public Student(String name) {
		// 코드 내부에 임시적으로 String name = "김효정";이 생김
		this.name = name;
	}
	
	// 일반 메서드
//	public String naming(String name) {
//		this.name = name;
//		return name;
//	}
	
	// get: 무언가를 얻다, name: 필드명, get + '필드명'을 camelCase로 작성
	// -> getter 메서드(getter(), 어떤 객체의 필드값을 가져다주는 역할, 사람, 기능)
	public String getName() {
		return name;
	}
	
	// set: 설정, setting, name: 필드명, set + '필드명'을 camelCase로 작성
	// -> setter 메서드(setter(), 어떤 객체의 필드의 값을 설정(초기화)해주는 역할, 사람, 기능)
	public void setName(String name) {
		System.out.println(this);
		this.name = name;
	}
	
	// 나이를 설정하는 setter()
	public void setAge(int age) {
		// 다른 코드도 작성이 가능
		if (age >= 8 && age <= 26) {
			// 유효한 조건
			this.age = age;
		} else {
			System.out.println("뭐하시는 거에요?");
		}
	}

}

// Access(접근)Modifier(제어자)
// 접근 제어자, 제한자
// public : 모든 패키지에서 아무런 제한 없이 접근 가능
// protected: 같은 패키지에서 접근 가능, (다른 패키지에 속한 클래스가 해당 클래스의 자식 클래스일 경우 접근 가능)
// default: 같은 패키지에서 접근 가능
// private: 동일 패키지 관계 없이, 아무도 접근 불가(나만 접근 가능)




