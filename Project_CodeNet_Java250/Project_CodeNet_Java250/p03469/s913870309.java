import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String n = sc.next();

		System.out.println("2018/01/"+n.substring(8));

		sc.close();
	}
}