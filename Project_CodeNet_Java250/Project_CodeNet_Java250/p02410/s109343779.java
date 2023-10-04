import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		int[][] A = new int[n][m];
		int[] B = new int[m];
		int[] C = new int[n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <  m; j++) {
				A[i][j] = stdIn.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			B[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				C[i] += A[i][j] * B[j];
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(C[i]);
		}
	}

}