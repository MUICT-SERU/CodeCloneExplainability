import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		if (n < 105) 
			System.out.println(0);
		else if (n < 135) 
			System.out.println(1);
		else if (n < 165) 
			System.out.println(2);
		else if (n < 189)
			System.out.println(3);
		else if (n < 195)
			System.out.println(4);
		else
			System.out.println(5);
	}
}