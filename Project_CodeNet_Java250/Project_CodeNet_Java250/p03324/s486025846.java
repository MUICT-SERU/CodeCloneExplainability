import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int D = scn.nextInt();
		int N = scn.nextInt();
		System.out.println(N == 100?(long)Math.pow(100, D) * 101:(long)Math.pow(100, D) * N);
		scn.close();
	}
}
