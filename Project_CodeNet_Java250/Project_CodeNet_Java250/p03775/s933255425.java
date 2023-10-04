
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	long N;
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextLong();
		long min=Long.MAX_VALUE/2;
		for(int i=1;i<=Math.sqrt(N);i++){
			if(N%i==0){
				long digit=Math.max(i, N/i);
				min=Math.min(min, digit);
			}
		}
		String s=String.format("%d", min);
		System.out.println(s.length());
	}
}