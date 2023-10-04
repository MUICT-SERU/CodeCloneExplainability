import java.util.*;

// UVa 11504

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] c1 = in.next().toCharArray();
		char[] c2 = in.next().toCharArray();
		char[] c3 = in.next().toCharArray();
		
		char turn = 'a';
		int ai = 0;
		int bi = 0;
		int ci = 0;

		while (true) {
			if (turn == 'a') {
				if (ai == c1.length) {
					System.out.println("A");
					break;
				} else {
					turn = c1[ai];
					ai++;
				}
			}
			if (turn == 'b') {
				if (bi == c2.length) {
					System.out.println("B");
					break;
				} else {
					turn = c2[bi];
					bi++;
				}
			}
			if (turn == 'c') {
				if (ci == c3.length) {
					System.out.println("C");
					break;
				} else {
					turn = c3[ci];
					ci++;
				}
			}
		}
	}
}