import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if(N == 1 && M == 1){
			System.out.println(0);
		}else if((N == 1 && M == 2) || (N == 2 && M == 1)){
			System.out.println(1);
		}else{
		int n = N * (N - 1) / 2;
		int m = M * (M - 1) / 2;

		System.out.println(n + m);
		}
	}
}