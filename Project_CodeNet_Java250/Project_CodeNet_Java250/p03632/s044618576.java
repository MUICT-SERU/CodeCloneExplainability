import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int min = A < C ? C : A;
		int max = B < D ? B : D;

		int out = max < min ? 0 : max - min;
		System.out.println(out);
	}
}
