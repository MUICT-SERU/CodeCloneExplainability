import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		TreeSet<Integer> A = new TreeSet<>();
		TreeSet<Integer> Z = new TreeSet<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				A.add(i);
			} else if (s.charAt(i) == 'Z') {
				Z.add(i);
			}
		}
		System.out.println(Z.last() - A.first() + 1);

	}
}