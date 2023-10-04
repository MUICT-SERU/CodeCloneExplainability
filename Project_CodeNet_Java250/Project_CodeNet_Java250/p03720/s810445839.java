import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] road = new int[n];

		for(int i = 0 ; i < n ; i++) {
			road[i] = 0;
		}

		for(int i = 0 ; i < m ; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			road[from - 1] += 1;
			road[to - 1] += 1;
		}

		for(int i = 0 ; i < n ; i++) {
			System.out.println(road[i]);
		}
	}
}
