import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = a / b;
		int r = a % b;
		double f = 1.00000*a / b;
		System.out.print(d + " " + r + " ");
		System.out.println(String.format("%6f", f));
	}
}
