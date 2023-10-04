import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int max = sc.nextInt();
		int min = max;
		
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			if (a > max)			max = a;
			else if (a < min)		min = a;
		}
		
		System.out.println(Math.abs(max - min));
	}
}