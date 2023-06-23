package day0624;

import java.util.Scanner;

public class Test01_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1을 입력 받으면 계속 반복
		// 그외의 값이면 종료(반복X)
		int num = sc.nextInt();
		while(num == 1) {
			System.out.println("블록을 실행합니다.");
			num = sc.nextInt();
		}
	}
}
