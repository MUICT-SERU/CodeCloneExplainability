import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
 
		for (int i = 0; i < n; i++) {
			h -= sc.nextInt();
		}
		sc.close();
		if (h <= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}