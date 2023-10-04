import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				count++;
				continue;
			}
			if (arr[i - 1] != arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
