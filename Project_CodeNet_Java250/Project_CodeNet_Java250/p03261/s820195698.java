import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, String> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			map.put(i, sc.next());
		}

		boolean ans = true;
		HashMap<Integer, String> past = new HashMap<>();
		String next = "";

		for (int i = 0; i < N; i++) {
			if (past.containsValue(map.get(i))) {
				ans = false;
				break;
			}
			past.put(i, map.get(i));
			if (i != 0) {
				if (!next.equals(map.get(i).substring(0, 1))) {
					ans = false;
					break;
				}
			}
			next = map.get(i).substring(map.get(i).length()-1, map.get(i).length());
		}
		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
