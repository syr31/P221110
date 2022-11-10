package p221110;

// 값을 입력하고 최대값 순서대로 출력하는 문제
//import java.util.Scanner;
//
//public class Quiz_1 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] ar = new int[6];
//		for (int i = 0; i < ar.length; i++) { // 입력
//			ar[i] = sc.nextInt();
//		}
//		sc.close();
//		
//		for (int i = 0; i < ar.length; i++) { // 출력
//			System.out.print(ar[i] + " ");
//			//입력 값 확인
//		}
//		System.out.println();
//
//		for (int i = 0; i < ar.length; i++) {		// 반복문 선언해서 입력한 최대값을 찾는다.
//			int max = 0;							// max 선언
//			
//			//최대값을 찾는 과정			
//			for (int j = 0; j < ar.length; j++) {	//
//				if (max < ar[j]) {
//					max = ar[i];
//				}
//			}
//			
//			//최대값을 -1로 대입 
//			for (int j = 0; j < ar.length; j++) {
//				if (max == ar[j]) {
//					ar[j] = -1;
//				}
//			}
//			
//			for (int j =0; j<ar.length; j++) {
//				System.out.print(ar[j] + " ");
//			}
//			System.out.print(" : max - "+ max + "\n");
//
//		}
//	}
//}


//--------------------------------------------------------------------------
import java.util.Scanner;

public class Quiz_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[6];
		boolean chk[] = new boolean[6];
		for (int i = 0; i < ar.length; i++) { // 입력
			ar[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < ar.length; i++) { // 출력
			System.out.print(ar[i] + " ");
			//입력 값 확인
		}
		System.out.println();

		for (int i = 0; i < ar.length; i++) {		// 반복문 선언해서 입력한 최대값을 찾는다.
			int max = Integer.MIN_VALUE;							// max 선언
			
			//최대값을 찾는 과정			
			for (int j = 0; j < ar.length; j++) {	//
				if (max < ar[j] && chk[j] == false) {
					max = ar[i];
				}
			}
			
			//최대값을 -1로 대입 
			for (int j = 0; j < ar.length; j++) {
				if (max == ar[j]) {
					chk[j] = true;
				}
			}
			
			for (int j =0; j<ar.length; j++) {
				System.out.print(ar[j] + " ");
			}
			System.out.println();
			for (int j= 0; j < ar.length; j++) {
				System.out.printf("%5b", chk[j]);
				System.out.print(chk[j] + " ");
			}
			System.out.print(" : max - "+ max + "\n");
		}
	}
}

