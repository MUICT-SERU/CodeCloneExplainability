import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int r = 0, c = 0;
		int i = 0, j = 0;
		ArrayList<Integer> elements = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		for (int t = 0; t < 2; ++t) {
			elements.add(sc.nextInt()); // ?????????????´???°?±????
		}
		r = elements.get(0);
		c = elements.get(1);
		if (r >= 1 && r <= 100 && c >= 1 && c <= 100) { // ??¶?´??????¶
			int[][] mat = new int[r + 1][c + 1]; // ?¨?????????????????????????????????????????????¨???????????????[r+1][c+1]
			for (i = 0; i < r; ++i) {
				for (j = 0; j < c; ++j) {
					mat[i][j] = 0; // ??????????????????
				}
			}

			for (i = 0; i < r; ++i) {
				for (j = 0; j < c; ++j) {
					mat[i][j] = sc.nextInt(); // ????´????????????????
					mat[i][c] += mat[i][j]; // ???????????????????????????
					mat[r][j] += mat[i][j]; // ??????????????????
					mat[r][c] += mat[i][j]; // ?????????????¨?
				}
			}
			for (i = 0; i < r + 1; ++i) {
				for (j = 0; j < c + 1; ++j) {
					System.out.print(mat[i][j]);
					if (j != c) { // ?????????????????????????????????AOJ??§?????¬?????????????????§?????¨??????????????????????????????
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
		sc.close();
	}

}