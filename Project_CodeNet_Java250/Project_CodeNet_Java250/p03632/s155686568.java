import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int count = Math.min(b, d) - Math.max(a, c);
		if (count < 0) {
			System.out.println(0);
		} else {
			System.out.println(count);
		}
	}
}