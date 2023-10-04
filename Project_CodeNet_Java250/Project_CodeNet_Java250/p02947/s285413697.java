import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Long> map = new HashMap<>();
		long total = 0;
		for ( int i = 0; i < n; i++ ) {
			char[] s = in.next().toCharArray();
			Arrays.sort(s);
			String key = new String(s);
			Long cnt = (map.containsKey(key) ? map.get(key) + 1 : 1);
			map.put(key, cnt);
			total += cnt - 1;
		}

		System.out.println(total);
		in.close();
	}
}