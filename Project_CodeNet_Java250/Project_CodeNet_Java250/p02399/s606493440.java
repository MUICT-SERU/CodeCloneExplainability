import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		scan.close();

		System.out.printf("%d %d %f", a/b, a%b, (double)a / b);
	}

}