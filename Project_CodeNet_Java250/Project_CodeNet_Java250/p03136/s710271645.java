import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		int sum = 0;
		for(int j = 0; j<N-1; j++) {
			sum += list.get(j);
		}
		if(sum > list.get(N-1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}