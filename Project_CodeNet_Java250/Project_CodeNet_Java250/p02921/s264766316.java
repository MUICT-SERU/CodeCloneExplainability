import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int count = 0;

		for(int i = 0; i < s.length; i++) {
			count += s[i] == t[i] ? 1 : 0;
		}

		System.out.println(count);
	}
}