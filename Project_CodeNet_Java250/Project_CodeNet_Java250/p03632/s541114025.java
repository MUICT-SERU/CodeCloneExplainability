import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int start = Math.max(A, C);
		int end = Math.min(B, D);

		if (start > end){
			System.out.println("0");
		} else {
			System.out.println(end - start);
		}

	}

}
