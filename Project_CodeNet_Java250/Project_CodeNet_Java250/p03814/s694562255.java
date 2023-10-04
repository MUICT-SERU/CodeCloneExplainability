import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int start = 0;
		int goal = 0;
		for(int i = 0; i < x.length(); i++) {
			if(x.charAt(i) == 'A') {
				start = i;
				break;
			}
		}
		for(int i = x.length() - 1; i >= 0; i--) {
			if(x.charAt(i) == 'Z') {
				goal = i;
				break;
			}
		}
		System.out.println(goal - start + 1);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
