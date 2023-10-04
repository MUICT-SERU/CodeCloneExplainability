import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int count = 0;
		for (int i=0; i<N; i++) {
			int minj = i;
			for (int j=i; j<N; j++) {
				if (A[j]<A[minj]) {
					minj = j;
				}
			}
			if (i!=minj) {
				count++;
				int tmp = A[i];
				A[i] = A[minj];
				A[minj] = tmp;
			}
		}
		for (int i=0; i<N; i++) {
			if (i!=0) {
				System.out.print(" ");
			}
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.println(count);

		sc.close();
	}

}