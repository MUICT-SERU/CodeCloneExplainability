import java.io.IOException;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				cnt++;
			}
		}

		System.out.println((double)cnt / n);
	}
	
}