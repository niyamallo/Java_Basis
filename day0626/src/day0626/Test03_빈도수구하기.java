package day0626;
 
import java.util.Arrays;

public class Test03_빈도수구하기 {
	public static void main(String[] args) {
		// 0부터 9까지 숫자
		int[] arr = {0, 0, 2, 1, 0, 3, 6, 2, 5, 7, 8, 5, 2, 5, 3};
		// 카운팅 배열
		int[] count = new int[10]; // 0부터 9까지의 인덱스가 필요하므로 크기10의 배열
		// count[index] : index가 num인 숫자의 빈도수
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		System.out.println(Arrays.toString(count));
	}
}
