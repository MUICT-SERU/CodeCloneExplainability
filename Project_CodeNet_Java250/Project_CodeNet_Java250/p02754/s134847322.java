import java.util.*;
 
 
public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long Q = N/(A+B);
		long ex = N%(A+B);
		long R = 0;
		if(A > 0) {
			if(ex < A) {
				R = A * Q + ex;
			}
			else if(ex >= A) {
				R = (Q+1) * A;
			}
		}
		System.out.println(R);
	}
}