import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int index = (int)(Math.log(new Scanner(System.in).nextInt()) / Math.log(2.0));
		System.out.println((int)Math.pow(2, index));
	}
}
