

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n, x;
		n = scan.nextInt();

		for (int count = 1; count <= n; count++) {
			if ((count % 3 == 0)) {
				sb.append(" ");
				sb.append(count);
			} else {

				x = count;

				do {// ?????°??????????????????3?????????????????°??????????????????
					if (x % 10 == 3) {//3???????????????????¢???????????????¶
						sb.append(" ");
						sb.append(count);
						break;
					}
					x = x / 10;//?????????????????¨???
				} while (x != 0);

			}
		}

		System.out.println(new String(sb));

	}
}