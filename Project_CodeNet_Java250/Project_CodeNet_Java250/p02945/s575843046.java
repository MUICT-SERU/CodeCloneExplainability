import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextInt();
		long B = scan.nextInt();

		System.out.println(Math.max(A*B,  Math.max(A - B, A + B)));
	}
}