import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		Arrays.parallelSort(s);
		if (s[0] == s[1] && s[2] == s[3] && s[0] != s[2]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}