import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int indA = str.indexOf('A');
		int indZ = str.lastIndexOf('Z');
		System.out.println(indZ-indA + 1);
	}
}
