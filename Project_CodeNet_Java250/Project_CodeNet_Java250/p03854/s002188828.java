import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		if(s.matches("(dream|dreamer|erase|eraser)+")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
