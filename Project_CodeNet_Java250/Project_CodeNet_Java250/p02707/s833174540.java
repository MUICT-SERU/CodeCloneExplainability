import java .util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] sum = new int[N];
	for (int i=0; i<N-1; i++) {
	    sum[sc.nextInt()-1]++;
	}
	for (int i=0; i<N; i++) {
	    System.out.println(sum[i]);
	}
    }
}