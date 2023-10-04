

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		selectionSrot(A, N);
		scan.close();
	}

	public static void selectionSrot(int[] A, int N) {
		// ???????????°
		int count = 0;
		
		for (int i = 0; i < N - 1; i++) {
			// ???????????????????????????????????\??¨
			int initialA = A[i];
			int minIndex = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[minIndex] > A[j]) {
					minIndex = j;
				}
			}
			// ????°??????????????????????????????¨??????
			int temp = A[i];
			A[i] = A[minIndex];
			A[minIndex] = temp;
			// ???????????????????????§??????
			if (initialA != A[i]) {
				count++;
			}

		}
		
		String output = Arrays.toString(A).replaceAll(",", "");
		System.out.println(output.substring(1, output.length() - 1));
		System.out.println(count);
	}
}