import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int[] s = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++) {
				s[i] = stdIn.nextInt();
				sum += s[i];
			}
			double m = sum/(double)n;
			double a = 0.0;
			for(int i = 0; i < n; i++) {
				a += (s[i] - m)*(s[i] - m);
			}
			a= a/(double)n;
			
			System.out.println(Math.sqrt(a));
			
		}
	}
}