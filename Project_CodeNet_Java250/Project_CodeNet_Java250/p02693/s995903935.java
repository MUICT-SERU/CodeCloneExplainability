import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean ans = false;
		
		for(int i = a; i <= b; i++) {
			if(i % k == 0) {
				ans = true;
				break;
			}
		}

		System.out.println(ans ? "OK" : "NG");
		sc.close();
	}

}