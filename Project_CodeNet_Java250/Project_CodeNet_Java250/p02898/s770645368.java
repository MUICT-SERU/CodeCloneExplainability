import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
		for(int i = 0; i < N; i++){
			if(sc.nextInt() >= K)count++;
		}
		System.out.println(count);
	}
}