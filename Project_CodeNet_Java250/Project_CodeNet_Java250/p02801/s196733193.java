import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] c = scan.next().toCharArray();
		scan.close();
		
		System.out.println((char)(c[0] + 1));
	}
}