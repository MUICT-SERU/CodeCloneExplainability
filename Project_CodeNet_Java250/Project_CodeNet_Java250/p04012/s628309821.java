import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		if (w.length() % 2 == 1) {
			System.out.println("No");
			return;
		}
		int a = 'a';
		int z = 'z';
		boolean flag = true;
		for (int i = a; i <= z; i++) {
			int count = 0;
			for (int j = 0; j < w.length(); j++) {
				if (w.charAt(j) == i) {
					count++;
				}
			}
			if (count % 2 == 1) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}