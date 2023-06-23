package day0623;

public class Test03_Print {
	public static void main(String[] args) {
		// print: "문자열"
		// println: "문자열" + "\n"
		// printf: %d, %s, %c, ... 형식지정자
		
		System.out.print("Hello SSAFY!\n");
		System.out.print("Hello Great 9th!\n");
		
		// 역슬래쉬를 출력하는 방법
		System.out.println("\\");
		
		// 따옴표를 출력하는 방법
		System.out.println("\"");
		
		System.out.printf("%d\n", 10);
		System.out.printf("%4d\n", 10); // 4칸을 확보한 다음, 오른쪽 정렬
		System.out.printf("%-4d\n", 10); // 4칸을 확보한 다음, 왼쪽 정렬
		System.out.printf("%04d\n", 10); // 4칸을 확보한 다음, 오른쪽 정렬하되 빈칸은 0
		
		// %f는 소숫점 최대 6자리까지 나오면서 반올림됨
		System.out.printf("%f\n", 10.1);
		System.out.printf("%f\n", 10.12345678);
		System.out.printf("%.2f\n", 10.12345678);

	}
}
