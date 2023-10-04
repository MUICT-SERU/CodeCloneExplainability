import java.util.Scanner;

public class Main {
	public static void main(String ...args) {
		try(Scanner scanner = new Scanner(System.in)){
			int N = scanner.nextInt();
			String N2 = Integer.toBinaryString(N);
			String N3 = N2.replaceAll("1", "0");
			String N4 = N3.replaceFirst("^0", "1");
			System.out.println(Integer.parseInt(N4, 2));
		}
	}
}
