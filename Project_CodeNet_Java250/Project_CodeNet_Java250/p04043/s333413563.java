import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (A * B * C == 175) {
			System.out.print("YES");
		}else {
			System.out.print("NO");			
		}
	}
}