import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C, D;
		int start, end;
		int ans;

		A = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());
		C = Integer.parseInt(sc.next());
		D = Integer.parseInt(sc.next());

		if(B < C || D < A){
			ans = 0;
		}else{
			start = Math.max(A, C);
			end = Math.min(B, D);
			ans = end - start;
		}

		System.out.println(ans);

	}

}