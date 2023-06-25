package day0626;

public class Test04_2차원배열선언 {
	public static void main(String[] args) {
		int[][] arr = new int[3][4]; // 권장
		// int[] arr2[] = new int[3][4]; 가능
		
		// new int[행][열]
		// 행: 2차원 배열의 크기 = 길이
		// 열: 1차원 배열의 크기 = 길이
		// arr[r][c] : r행 c열의 원소, (r번째 1차원 배열의 c번째 원소)
		for(int r=0; r<3; r++) {
			for(int c=0; c<4; c++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
		
	}
}
