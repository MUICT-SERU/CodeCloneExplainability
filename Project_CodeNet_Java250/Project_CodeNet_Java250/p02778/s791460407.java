import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println(str.replaceAll("[a-z]", "x"));
		sc.close();
	}
}
