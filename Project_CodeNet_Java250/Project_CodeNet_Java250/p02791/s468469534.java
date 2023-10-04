import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}
	
	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		Queue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			q.add(arr[i]);
			if (arr[i] <= q.peek()) {
				sum++;
			}
		}
		return sum;
	}
}