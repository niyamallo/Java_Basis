// day0702 test03의 PersonTest.java를 누른 후 복사해서 붙여넣은 클래스 기반

package test04;

public class PersonTest {
	public static void main(String[] args) {
//		Person p1 = new Person(); 파라미터가 있는 생성자를 만들었기 때문에 더이상 이렇게 사용 불가
		Person p1 = new Person("김말이", 20);
		Person p2 = new Person("떡볶이", 28);
		Person p3 = new Person("군만두", 26);
		Person p4 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p4.name);

	}
}
