import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = Integer.parseInt(scan.next());
		int h = s / 3600;
		s = s % 3600;
		int m = s / 60;
		System.out.println(h + ":" + m + ":" + s % 60);
		scan.close();
	}
}
