import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(c <= a) {
			int w = a;
			a = c;
			c = w;
			int y = b;
			b = d;
			d = y;
		}
		//これでa<cである
		if(b <= c) {
			System.out.println(0);
			return;
		}
		if(b <= d) {
			System.out.println(b - c);
		} else {
			System.out.println(d - c);
		}
	}
}