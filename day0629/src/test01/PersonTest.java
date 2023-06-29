package test01;

// 같은 패키지 안에서는 import 할 필요 없음.
// public은 다른 패키지에서도 import 할 필요 없음.
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(); // 객체의 생성: new 키워드 + 생성자 호출
		p1.name = "Niyamallo";
		p1.age = 29;
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "뽀로로";
		p2.age = 100;
		p2.eat();
	}
}
