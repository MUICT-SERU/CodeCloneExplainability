import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int inputNum1 = sc.nextInt();
		int intCount = 0;

		for(int i = a; i <= b; i++) {
			int intYakusuu = inputNum1 % i;
			if(intYakusuu == 0) {
				intCount++;
			}
		}
		System.out.println(intCount);
	}
}