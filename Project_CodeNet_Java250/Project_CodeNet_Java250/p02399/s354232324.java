
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(String.format("%s %s %.5f", num1 / num2,
				num1 % num2, (double) num1 / num2));
	}
}