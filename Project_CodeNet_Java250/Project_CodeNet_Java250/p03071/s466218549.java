import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		
		if(a - b >= 2)
			System.out.println(a + a - 1);
		else if(b - a >= 2)
			System.out.println(b + b - 1);
		else
			System.out.println(a + b);
	}
}
