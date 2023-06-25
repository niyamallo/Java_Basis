package day0626;

import java.util.Arrays;

public class Test01_배열의복사 {
	public static void main(String[] args) {
		int[] scores = new int[] {29, 45, 67, 84, 92};
		// scores[5] = 44; 안됨. 0~4까지의 배열만 만들었으니까.
		// 배열은 크기가 고정되어있으므로 새로운 배열에 복사하는 방식으로 늘려서 사용
		
		int[] newScores = new int[10];
		for(int i=0; i<5; i++) {
			newScores[i] = scores[i];
		}
		System.out.println(Arrays.toString(newScores));
		
		int[] newScores2 = Arrays.copyOf(scores, 10);
		System.out.println(Arrays.toString(newScores2));
		
		int[] newScores3 = Arrays.copyOf(scores, scores.length*3);
		System.out.println(Arrays.toString(newScores3));
	}
}
