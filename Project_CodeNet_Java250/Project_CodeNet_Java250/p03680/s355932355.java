import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int temp = scan.nextInt();
			list.add(temp);
		}
		if (list.get(0) == 2) {
			System.out.println(1);
			return;
		}
		int index = 1;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			index = list.get(index - 1);
			ans++;
			if (list.get(index - 1) == 2) {
				System.out.println(++ans);
				return;
			}
		}
		System.out.println(-1);

	}

}