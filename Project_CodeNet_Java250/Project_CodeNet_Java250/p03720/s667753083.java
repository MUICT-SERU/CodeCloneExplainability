
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = 0, m = 0;
		int i = 0, j = 0;
		n = sc.nextInt();
		m = sc.nextInt();
		int Ln1[] = new int[m];
		int Ln2[] = new int[m];
		int Ln[] = new int[n];

		for (i = 0; i < m; i++) {
			Ln1[i] = sc.nextInt();
			Ln2[i] = sc.nextInt();
		}
		for (i = 0; i < m; i++) {
			for (j = 1; j <= n; j++)
				if (j == Ln1[i])
					Ln[j - 1]++;
			for (j = 1; j <= n; j++)
				if (j == Ln2[i])
					Ln[j - 1]++;
		}

		for (i = 0; i < n; i++)
			System.out.println(Ln[i]);

	}

}
