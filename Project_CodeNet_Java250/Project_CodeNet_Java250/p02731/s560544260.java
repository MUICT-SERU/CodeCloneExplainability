import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		double length = input/(double)3;
		System.out.println(length*length*length);
	}
}