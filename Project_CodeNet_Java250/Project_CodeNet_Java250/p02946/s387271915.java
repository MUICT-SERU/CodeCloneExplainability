import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		for (int i=X-K+1;i<K+X;i++) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
