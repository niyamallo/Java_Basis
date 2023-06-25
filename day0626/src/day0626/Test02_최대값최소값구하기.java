package day0626;

public class Test02_최대값최소값구하기 {
	public static void main(String[] args) {
		int[] arr = {21, 3, 45, 67, 12, 1, 45, 99, 102, 30, 504};
		
		// 최소값
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) min = arr[i];
		}
		System.out.println(min);
		
		// 최대값
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		System.out.println(max);
	}
}
