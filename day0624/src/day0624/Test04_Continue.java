package day0624;

public class Test04_Continue {
	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			if (i==3) continue;
//			System.out.println(i);
//		}
		
		outer: for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if(i==1) continue outer;
				System.out.println(i+","+j);
			}
		}
	}

}
