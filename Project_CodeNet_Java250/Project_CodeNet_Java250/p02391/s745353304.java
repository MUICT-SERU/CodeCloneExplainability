import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		// ?????°?????£?¨?
		int a, b;
		String str1, str2;
		ArrayList<String> st = new ArrayList<String>();

		// ???????????????
		Scanner scan = new Scanner(System.in);
		st.add(scan.next());
		st.add(scan.next());

		str1 = st.get(0);
		str2 = st.get(1);

		a = Integer.parseInt(str1);
		b = Integer.parseInt(str2);

		if (a < -1000 || b < -1000 || a > 1000 || b > 1000) { // a,b??§?????¶??????
			System.out.println("a,b?????????-1000~1000??§??\???.???????????????.");
			System.exit(0);
		}

		if (a > b) {
			System.out.println("a > b");
		}

		else if (a < b) {
			System.out.println("a < b");
		}

		else if (a == b) {
			System.out.println("a == b");
		}
	}

}