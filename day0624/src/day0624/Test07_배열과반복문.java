package day0624;

import java.util.Arrays;
import java.util.Scanner;

public class Test07_배열과반복문 {
	public static void main(String[] args) {
		// 배열 만들기
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		for(int i=0; i<5; i++) {
			scores[i] = sc.nextInt();
		}
		
		// 배열 출력하기(전통적인 for문)
		for(int i=0; i<5; i++) {
			System.out.println(i+"번째 점수는 :"+scores[i]);
		}
		
		// 배열 출력하기(향상된 for문(for-each))
		for(int num : scores) {
			System.out.println("점수는 :"+num);
		}
		
		// Array.toString을 이요한 배열 출력(Array입력, Ctrl+Space)
		System.out.println(Arrays.toString(scores));
		// [1, 3, 5, 7, 9]
		
		// 평균
		int sum = 0;
		for(int num : scores) {
			sum = sum + num; // sum += num;
		}
		System.out.println("평균은 "+ sum/5);
	}
}
