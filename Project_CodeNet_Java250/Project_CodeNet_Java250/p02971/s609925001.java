import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]A = new int[N];
			int[]B = new int[N];
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				B[i] = A[i];
			}
			Arrays.sort(B);
			int max = B[N-1];
			int  maxdub = 0;
			if(B[N-2]==max)maxdub =1;
			
			for(int i = 0;i<N;i++) {
				if(A[i]<max) {
					System.out.println(max);
				}else{
					if(maxdub==0) {
						System.out.println(B[N-2]);
					}else{
						System.out.println(max);
					}
				}
			}
			
		}
		
		
	}
		

}
