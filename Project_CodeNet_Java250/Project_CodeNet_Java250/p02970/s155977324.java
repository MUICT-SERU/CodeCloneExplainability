import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double D = sc.nextDouble();
		System.out.println((int)Math.ceil(N / ((2 * D) + 1)));
	}
}
