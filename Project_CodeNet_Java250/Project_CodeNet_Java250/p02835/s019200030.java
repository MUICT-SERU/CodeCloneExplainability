import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextInt() + in.nextInt() + in.nextInt() >= 22 ? "bust" : "win");
		in.close();

	}
}