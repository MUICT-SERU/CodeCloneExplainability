
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String a = scanner.nextLine();
			if (a.equals("0"))
				break;
			int sum = 0;
			for (char b : a.toCharArray()) {
				sum += Integer.parseInt(String.valueOf(b));
			}
			System.out.println(sum);
		}
	}
}