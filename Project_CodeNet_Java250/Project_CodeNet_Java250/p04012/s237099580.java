import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		int count = 0;
		for (int i = 0 ; i < w.length() ; i++) {
			for (int j = 0 ; j < w.length() ; j++) {
				if (w.charAt(i) == w.charAt(j)) {
					count++;
				}
			}
			if (count % 2 != 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}