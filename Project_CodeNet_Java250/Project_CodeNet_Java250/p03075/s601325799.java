import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = reader.nextInt();
		}
		int k = reader.nextInt();
		Arrays.sort(arr);
		String ans = ":(";
		if (arr[4]-arr[0] <= k) {
			ans = "Yay!";
		}

		System.out.print(ans);
		reader.close();
	}
}



