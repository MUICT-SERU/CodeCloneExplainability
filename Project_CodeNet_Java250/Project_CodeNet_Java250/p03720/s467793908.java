import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < 2; j++) {
					int x = sc.nextInt();
					if (map.get(x) == null) {
						map.put(x, 1);
					} else {
						map.put(x, map.get(x) + 1);
					}
				}
			}

			for (int i = 1; i <= n; i++) {
				if (map.get(i) == null) {
					System.out.println("0");
				} else {
					System.out.println(map.get(i));
				}
			}
		}
	}
}