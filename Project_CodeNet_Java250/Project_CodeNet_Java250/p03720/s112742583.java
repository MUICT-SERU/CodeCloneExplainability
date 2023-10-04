
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = scan.nextInt();
	int M = scan.nextInt();

	int[] data = new int[N];

	for (int i = 0; i < M; i++) {
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    data[a-1]++;
	    data[b-1]++;
	}

	for (int i = 0; i < N; i++) {
	    System.out.println(data[i]);
	}
	scan.close();
    }
}
