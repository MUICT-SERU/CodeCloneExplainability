import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ???????????????
 *
 * @author B7078
 *
 */
class Calcurator {

	public void Cal(int n, String str) { // Cal????????????:3????????°or3???????????´??°????????\

		for (int i = 1; i <= n; ++i) {
			if (i % 3 == 0) { // 3??§?????????????????´??°
				System.out.print(" ");
				System.out.print(i);
			} else if (String.valueOf(i).indexOf("3") != -1) { // ??´??°???"3"????????????????????\
				System.out.print(" ");
				System.out.print(i);
			}
		}
		System.out.println("");
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		/**
		 *
		 */
		Calcurator cal1;
		cal1 = new Calcurator();
		/**
		 * ?????°?????£?¨?
		 */
		int n = 0;
		String str;
		/**
		 * ??´??°n?????\?????¨??????
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		n = Integer.parseInt(str);
		if (n >= 3 || n <= 10000) {
			cal1.Cal(n, str);
		}

	}

}