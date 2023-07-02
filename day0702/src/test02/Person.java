// day0702 test01의 Person.java를 누른 후 복사해서 붙여넣은 클래스 기반

package test02;

public class Person {

	static String species = "호모 사피엔스 사피엔스";
	
	String name;
	int age;
	
	public int add(int a, int b) {
		return a+b;
	}
	
	// 메서드가 종료되는 시점
	// - 블록의 끝을 만날 때
	// - return문을 만날 때(void에서도 return문을 쓸 수 있음)
	public void study(String subject) {
		// random은 0보다 크거나 같고 1보다 작은 값을 가져옴
		double probability = Math.random();
		System.out.println(subject+"를 공부합니다.");
		System.out.println("알고리즘 문제를 풉니다.");
		if(probability < 0.9999)
			return;
		
		System.out.println("게임을 합니다.");
		System.out.println("LOL 영상을 시청합니다.");
	}
	
	public void eat() {
		String dish = "짜장면";
	}
}
