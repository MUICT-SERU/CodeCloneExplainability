
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int[][] list1 = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				list1[i][j] = scanner.nextInt();
			}
		}
		int[][] list2 = new int[b][c];
		for (int i = 0; i < b; i++)
			for (int j = 0; j < c; j++)
				list2[i][j] = scanner.nextInt();

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < c; j++) {
				long sum = 0;
				for (int k = 0; k < b; k++) {
					sum += list1[i][k] * list2[k][j];
				}
				if (j == 0)
					System.out.print(sum);
				else
					System.out.print(" " + sum);
			}
			System.out.println();
		}

	}
}