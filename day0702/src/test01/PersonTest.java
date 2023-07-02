package test01;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		// 클래스 변수이므로 클래스명. 으로 접근가능
		System.out.println(Person.species);
		System.out.println(p2.species);
		System.out.println(p3.species);
	}
}
