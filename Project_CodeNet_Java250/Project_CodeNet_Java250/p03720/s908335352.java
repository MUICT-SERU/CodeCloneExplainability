import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numberCity = 0;
		int numberPath = 0;
		Scanner sc = new Scanner(System.in);
		numberCity = sc.nextInt();
		numberPath = sc.nextInt();
		sc.nextLine();
		int[] paths = new int[numberCity];
		for (int i = 0; i < numberPath; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			sc.nextLine();
			paths[from - 1]++;
			paths[to - 1]++;
		}
		sc.close();

		for (int i = 0; i < paths.length; i++) {
			System.out.println(paths[i]);
		}
	}
}