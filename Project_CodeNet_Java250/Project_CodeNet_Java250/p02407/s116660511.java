import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] Array = new int[n];
		// Array?????°????????£??\
		for(int i = 0; i < n; i++) {
			Array[i] = sc.nextInt();
		}
		System.out.print(Array[n-1]);
		for(int j = 0; j < n-1; j++) {
			System.out.print(" " + Array[n-2-j]);
		}
		System.out.println();
	}

}