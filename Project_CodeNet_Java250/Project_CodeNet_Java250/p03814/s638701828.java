import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String sub;
		int max = -1;
		sub = s.substring(s.indexOf("A"), s.lastIndexOf("Z") + 1);
		max = sub.length();
		System.out.println(max);
	}
}
