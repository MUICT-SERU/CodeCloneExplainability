import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] alpha = scanner.next().toCharArray();
			System.out.println(((alpha[0] >= 'A') && (alpha[0] <= 'Z')) ? "A" : "a");
		}
	}
}
