import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		for(int i = 0;i<m;i++) {
			n = n - scanner.nextInt();
			if (n<0) {
				System.out.println(-1);
				return;
			}
		}
		
		System.out.println(n);
	}

}