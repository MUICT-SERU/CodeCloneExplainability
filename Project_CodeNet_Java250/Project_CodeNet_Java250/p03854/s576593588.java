import java.util.*;

// ABC 49-C
// http://abc050.contest.atcoder.jp/tasks/arc066_a

public class Main {
	
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] c = in.next().toCharArray();
		int clen = c.length - 1;
		boolean isValid = true;
		
		while (clen >= 0 && isValid) {
			// Check dream
			if (clen - 4 >= 0 &&
					c[clen - 4] == 'd' && c[clen - 3] == 'r' && c[clen - 2] == 'e' && c[clen - 1] == 'a' && c[clen] == 'm') {
				clen -= 5;
				continue;
			}
			// Check dreamer
			if (clen - 6 >= 0 &&
					c[clen - 6] == 'd' && c[clen - 5] == 'r' && c[clen - 4] == 'e' && c[clen - 3] == 'a' && c[clen - 2] == 'm' && c[clen - 1] == 'e' && c[clen] == 'r') {
				clen -= 7;
				continue;
			}
			// Check erase
			if (clen - 4 >= 0 &&
					c[clen - 4] == 'e' && c[clen - 3] == 'r' && c[clen - 2] == 'a' && c[clen - 1] == 's' && c[clen] == 'e') {
				clen -= 5;
				continue;
			}
			// Check eraser
			if (clen - 5 >= 0 &&
					c[clen - 5] == 'e' && c[clen - 4] == 'r' && c[clen - 3] == 'a' && c[clen - 2] == 's' && c[clen - 1] == 'e' && c[clen] == 'r') {
				clen -= 6;
				continue;
			}
			isValid = false;
		}
		System.out.println(isValid ? "YES" : "NO");
		
	}
}