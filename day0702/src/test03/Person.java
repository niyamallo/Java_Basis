// day0702 test02의 Person.java를 누른 후 복사해서 붙여넣은 클래스 기반

package test03;

public class Person {

	static String species = "호모 사피엔스 사피엔스";
	
	String name;
	int age;

	// 메서드 오버로딩: 이름이 같은 메서드 여러개 만들 수 있다.
	// 파라미터가 달라야함!!
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	// 메서드 오버로딩의 장점
	// - 다양한 자룧ㅇ에 대해 메서드를 만들 때
	// - 이름을 똑같이 할 수 있음
	// addInt(), addDouble() 이렇게 2개를 만들 필요가 없게 됨
	
	// 반환형만 다른 것은 안된다!
//	public int add(double a, double b);
//		return (int) a+b;
	
	
	public void study(String subject) {
		double probability = Math.random();
		System.out.println(subject+"를 공부합니다.");
		System.out.println("알고리즘 문제를 풉니다.");
		if(probability < 0.9999)
			return;
		
		System.out.println("게임을 합니다.");
		System.out.println("LOL 영상을 시청합니다.");
	}
	
	// 메서드 오버로딩
	public void eat() {
		System.out.println("식사를 합니다.");
	}
	
	public void eat(String dish) {
		System.out.println(dish +"를 먹습니다.");
	}
	
	public void eat(String dish, int times) {
		System.out.println(dish+"를 "+times+"번 먹습니다.");
	}
	
	// 파라미터의 순서를 바꿔서 메서드 오버로딩을 할 수도 있음
	 public void eat(int times, String dish){
		System.out.println(times+"번 "+dish+"를 먹습니다.");
	 }
}
