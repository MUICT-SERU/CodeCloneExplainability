
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String d = scanner.nextLine();
		int sum = 0;
		while (true) {
			String a = scanner.nextLine();
			if (a.equals("END_OF_TEXT"))
				break;
			for (String s : a.split(" ")) {
				if (s.equalsIgnoreCase(d))
					sum++;
			}
		}
		System.out.println(sum);

	}
}