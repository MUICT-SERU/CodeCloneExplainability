import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		System.out.println(String.format("%.5f", Math.pow(r, (double) 2) * Math.PI) + " " + String.format("%.5f", r * (double) 2 * Math.PI));
	}
}