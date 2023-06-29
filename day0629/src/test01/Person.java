package test01;
// 모든 클래스는 특정 패키지(폴더)에 속해 있음
// 패키지: 클래스가 모여있는 폴더

// class 키워드르 사용해서 만든다
public class Person {
	// 속성, 데이터, 필드, 변수
	String name;
	int age;
	
	// 생성자
	// 클래스명과 같다.
	// 메서드와 달리 반환형을 지정하지 않는다.
	public Person() {
		
	}
	
	// 메서드
	// void는 반환형이 없다는 뜻
	// 메서드 안에서는 자기 자신의 변수를 사용가능
	public void eat() {
		System.out.println(name+"가 식사를 합니다.");
	}
}
