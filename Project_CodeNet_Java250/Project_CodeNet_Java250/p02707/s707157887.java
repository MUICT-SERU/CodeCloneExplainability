import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i=1; i<N; i++) {
			A[i] = sc.nextInt();
			B[A[i]-1]++;
		}
		for(int i=0; i<N; i++) {
			System.out.println(B[i]);
		}

	}

}