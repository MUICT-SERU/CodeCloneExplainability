import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), t = sc.nextInt();
		sc.close();
		int ans = t / a;
		ans *= b;
		System.out.println(ans);
	}
}
