import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		int t = 0;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		if (A <= C && C <= B) {
			if (B <= D) {
				t = B - C;
			} else {
				t = D - C;
			}
		} else if (C <= A && A <= D) {
			if (D <= B) {
				t = D - A;
			} else {
				t = B - A;
			}
		}
		System.out.println(t);
	}
}
