import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int cost = a * x + b * y;
		if (x > y) {
		    cost = Math.min(cost, c * y * 2 + (x - y) * a);
		    cost = Math.min(cost, c * x * 2);
		} else {
		    cost = Math.min(cost, c * x * 2 + (y - x) * b);
		    cost = Math.min(cost, c * y * 2);
		}
		System.out.println(cost);
	}
}
