// day0702 test03의 Person.java를 누른 후 복사해서 붙여넣은 클래스 기반

package test04;

public class Person {

	static String species = "호모 사피엔스 사피엔스";
	
	String name;
	int age;
	
	// 파라미터가 있는 생성자
	public Person(String name, int age) {
		// this 키워드: 인스턴스의 멤버에 접근
		this.name = name;
		this.age = age;
	}
	
	// 기본생성자도 직접 추가하면 오버로드 가능
	public Person(){
		this("고구마튀김", 22); // Person("고구마튀김", 22); 를 호출한 것과 동일한 결과
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	
	
	public void study(String subject) {
		double probability = Math.random();
		System.out.println(subject+"를 공부합니다.");
		System.out.println("알고리즘 문제를 풉니다.");
		if(probability < 0.9999)
			return;
		
		System.out.println("게임을 합니다.");
		System.out.println("LOL 영상을 시청합니다.");
	}
	
	public void eat() {
		System.out.println("식사를 합니다.");
	}
	
	public void eat(String dish) {
		System.out.println(dish +"를 먹습니다.");
	}
	
	public void eat(String dish, int times) {
		System.out.println(dish+"를 "+times+"번 먹습니다.");
	}
	
	 public void eat(int times, String dish){
		System.out.println(times+"번 "+dish+"를 먹습니다.");
	 }
}
