import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ?????????????????\????????????
		Scanner sc = new Scanner(System.in);

		// ??????????????\??????????????°?????\???????????°
		int lin = sc.nextInt();
		int col = sc.nextInt();

		// ????¬???????????????????
		int[][] grid = new int[lin + 1][col];

		// ????¬???????????????????lft:?????????????????????rgt:?????????????????????
		int lft;
		int rgt;

		// ??\??????????????°?????????????????\??????
		for (lft = 0; lft <= lin; lft++) {

			for (rgt = 0; rgt < col; rgt++) {

				grid[lft][rgt] = sc.nextInt();

			}
		}

		// ????¨??????\?????????????????????
		int[] sum = new int[lin];

		// ???????????????
		for (lft = 0; lft < lin; lft++) {

			for (rgt = 0; rgt < col; rgt++) {

				sum[lft] += grid[lft][rgt] * grid[lin][rgt];

			}
			System.out.println(sum[lft]);
		}
		sc.close();
	}
}