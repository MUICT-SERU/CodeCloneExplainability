import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
				
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		long k = 0;

		if(1<=N && N<=Math.pow(10,18) && 0<=A && 0<=B && 0<A+B && A+B<=Math.pow(10,18)){
			if(A+B<=N){
				k = N/(A+B);
				
				if(N-k*(A+B)>A){
					System.out.println( A*k + (N-k*(A+B)) - (N-(k*(A+B)+A)));
				}
				else{
					System.out.println( A*k + (N-k*(A+B)));
				}
				
			}
			else if(A+B>N && A<=N){
				System.out.println(A);
			}
			else{
				System.out.println(N);
			}
		}
	}
}