import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		
		for (int x = 0; x <= N; x++) {
			for (int y = 0; y <= N; y++) {
				int z = N - x - y;
				if (z < 0) {
					continue;
				}
				if (x * 10000 + y * 5000 + z * 1000 == Y) {
					System.out.println(x + " " + y + " " + z);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}