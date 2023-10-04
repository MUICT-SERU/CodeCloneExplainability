
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());

	int[] count = new int[9];
	
	for (int i = 0; i < N; i++) {
	    int a = Integer.parseInt(scan.next());
	    int rate = a / 400;
	    rate = (rate > 8 ? 8 : rate);

	    count[rate]++;
	}

	int min = 0;
	for (int i = 0; i < 8; i++) {
	    if(count[i] > 0) min++;
	}
	int max = min + count[8];
	if(min == 0) min = 1;
	
	System.out.println(min + " " + max);
	scan.close();
    }
}
