import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(64 <= N) {
			System.out.println(64);
		} else if(32 <= N) {
			System.out.println(32);
		} else if(16 <= N) {
			System.out.println(16);
		} else if(8 <= N) {
			System.out.println(8);
		} else if(4 <= N) {
			System.out.println(4);
		} else if(2 <= N) {
			System.out.println(2);
		} else {
			System.out.println(1);
		}
	}
}