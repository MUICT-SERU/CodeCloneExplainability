import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		if(number1 + number2 + number3 >=22) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}

	}

}