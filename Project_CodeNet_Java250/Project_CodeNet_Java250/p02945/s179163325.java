import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = Math.max(a + b, a -b);
		max = Math.max(max, a * b);
		System.out.println(max);
	}
}
