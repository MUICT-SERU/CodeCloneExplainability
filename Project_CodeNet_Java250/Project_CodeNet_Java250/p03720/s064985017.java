import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] road = new int[N+1];
    	for (int i = 0; i < M; i++) {
    		road[sc.nextInt()]++;
    		road[sc.nextInt()]++;
    	}
    	StringBuilder sb = new StringBuilder();
    	for (int i = 1; i < N+1; i++) {
    		sb.append(road[i] + "\n");
    	}
    	System.out.println(sb);
    }
}