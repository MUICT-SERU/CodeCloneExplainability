import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for (int i=0; i<N; i++) {
			hMap.put(sc.nextInt(), 1) ;
		}
		System.out.println(hMap.size());


	}

}
