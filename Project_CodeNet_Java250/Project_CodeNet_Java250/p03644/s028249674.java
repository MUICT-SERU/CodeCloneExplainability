import static java.lang.System.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(in);
		
		int n = s.nextInt();
		
		int cur = 1;
		int max = 0;
		
		for(int x=2;x<=n;x++) {
			int exp = 1;
			while(x%Math.pow(2,exp)==0 && Math.pow(2,exp)<x)
				exp++;
			
			if(exp>max) {
				max = exp;
				cur = x;
			}
		}
		
		out.println(cur);
	}
}