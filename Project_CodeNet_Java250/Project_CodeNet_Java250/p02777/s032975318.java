import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int rb = sc.nextInt();
		int bb = sc.nextInt();
		String U = sc.next();
		sc.close();
		if (U.equals(S)) {
			rb--;
		}
		if(U.equals(T)) {
			bb--;
		}
		System.out.println(rb + " " + bb);
	}

}
