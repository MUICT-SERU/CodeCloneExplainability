import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		for(int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		n[2] -= n[1];
		n[1] -= n[0];
		System.out.println(n[1]+n[2]);
	}
}