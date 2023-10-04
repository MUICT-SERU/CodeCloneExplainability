
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int length = line.length();
		for (int i = 0; i < length; i++) {
			char ch = line.charAt(i);
			if (Character.isLowerCase(ch) == true) ch = Character.toUpperCase(ch);
			else ch = Character.toLowerCase(ch);
			System.out.print(ch);
		}
		System.out.println();
	}
}

