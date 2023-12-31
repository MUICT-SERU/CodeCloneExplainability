import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int[] B = new int[M];
		int[][] A = new int[N][M];
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int resNum = 0;
		for (int i = 0; i < N; i++) {
			long sum = 0;
			for (int j = 0; j < M; j++) {
				sum += A[i][j] * B[j];
			}
			if (sum > -C) {
				resNum++;
			}
		}
		System.out.println(resNum);
	}
}
