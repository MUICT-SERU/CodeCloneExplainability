import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next()) + Integer.parseInt(sc.next()) + Integer.parseInt(sc.next());

		if (n > 21) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}
	}



}