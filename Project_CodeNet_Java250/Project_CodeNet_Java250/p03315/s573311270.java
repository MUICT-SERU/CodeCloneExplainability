import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int sum = 0;

		for (int i=0; i<n.length();i++) {
			char c = n.charAt(i);
			switch (c) {
			case '+':
				sum += 1;
				break;
			case '-':
				sum -= 1;

			}
		}
		System.out.println(sum);
	}
}