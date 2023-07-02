// day0702 test04의 Person.java를 누른 후 복사해서 붙여넣은 클래스 기반

package test05;

public class Person {

	static String species = "호모 사피엔스 사피엔스";
	
	String name;
	int age;
	
	public Person(String name, int age) {
		// this의 사용법. 자기자신의 멤버(변수)를 가리킬 때
		this.name = name;
		this.age = age;
	}
	
	public Person(){
		// this의 사용법. 생성자를 호출할 때
		this("고구마튀김", 22);
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
	
	// this의 사용법 설명을 위한 예시 메서드 sleep
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	public void eat() {
		System.out.println("식사를 합니다.");
		// this의 사용법. 자기 자신의 메서드를 호출할 때.
		this.sleep();
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
