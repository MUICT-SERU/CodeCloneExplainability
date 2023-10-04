import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ?????????????????\???
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		// ??\??????????????°???????????\??????????¬???????????????????????????°????????\??????
		int[][] table = new int[num1][num2];
		int[][] grid = new int[num2][num3];

		for (int cnt1 = 0; cnt1 < num1; cnt1++) {

			for (int cnt2 = 0; cnt2 < num2; cnt2++) {

				table[cnt1][cnt2] = sc.nextInt();
			}
		}

		for (int cnt1 = 0; cnt1 < num2; cnt1++) {

			for (int cnt2 = 0; cnt2 < num3; cnt2++) {

				grid[cnt1][cnt2] = sc.nextInt();
			}
		}

		// 2??????????¬????????????????????¨????
		long [][] sum = new long[num1][num3];
		int cnt0;
		int cnt1;
		int cnt2;

		for (cnt0 = 0; cnt0 < num1; cnt0++) {

			for (cnt1 = 0; cnt1 < num3; cnt1++) {

				for (cnt2 = 0; cnt2 < num2; cnt2++) {

					sum[cnt0][cnt1] += table[cnt0][cnt2] * grid[cnt2][cnt1];

				}

			}

		}

		for (cnt0 = 0; cnt0 < num1; cnt0++) {

			for (cnt1 = 0; cnt1 < num3; cnt1++) {

				if (cnt1 >= num3-1) {

					System.out.println(sum[cnt0][cnt1]);

				} else {

					System.out.print(sum[cnt0][cnt1] + " ");

				}
			}
		}
		sc.close();
	}

}