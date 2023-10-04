import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int r[] = new int[5];
		TreeMap<Integer, Integer> map = new TreeMap();

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			r[i] = a[i]%10;
			int b =10;
			if (r[i] != 0) {
				b = 10-r[i];
				map.put(b, a[i]);
			}
		}
		int ans = 0;

		if (map.size() == 0) {
			for (int i = 0; i < a.length; i++) {
				ans += a[i];
			}
			System.out.println(ans);
			return;
		}

		int last = map.get(map.lastKey());
		int idx = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == last) {
				idx = i;
			}
		}




		for (int i = 0; i < a.length; i++) {
			if (i != idx) {
				if (a[i]%10 == 0) {
					ans += a[i];
				} else {
					ans += a[i]+ (10- r[i]);
				}
			}
		}
		ans += last;

		System.out.println(ans);
	}
}
