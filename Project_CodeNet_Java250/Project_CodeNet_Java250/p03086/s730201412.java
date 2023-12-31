import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int maxLength = 0;
		int length = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			switch (c) {
			case 'A':
			case 'C':
			case 'G':
			case 'T':
				length++;
				break;
			default:
				length = 0;
				break;
			}

			if (length > maxLength) {
				maxLength = length;
			}
		}

		System.out.println(maxLength);

		sc.close();
	}
}
