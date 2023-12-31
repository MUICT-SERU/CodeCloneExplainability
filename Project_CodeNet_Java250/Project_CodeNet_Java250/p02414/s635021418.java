import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		long[][] C = new long[n][l];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j] = scanner.nextInt(); 
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<l;j++) {
				B[i][j] = scanner.nextInt(); 
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<l;j++) {
				long temp = 0;
				for(int k=0;k<m;k++) {
					temp += A[i][k]*B[k][j];
				}
				C[i][j] = temp;
				if (j!=l-1) {
					System.out.print(C[i][j] + " ");
				}else {
					System.out.print(C[i][j]);
				}
			}
			System.out.println();
		}
		scanner.close();
		
	}
}
