import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int c[] = new int[N];
		
		for(int i =0; i<2*M ; i++){
			int a = sc.nextInt();
			c[a-1]++;
		}
		
		for(int j =0; j<N; j++){
			System.out.println(c[j]);
		}
		
		
		
		
	}
}
