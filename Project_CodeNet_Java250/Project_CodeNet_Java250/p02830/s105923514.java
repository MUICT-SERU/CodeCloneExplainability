import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		for( int i=0; i<N; i++ ){
			char ch = S.charAt(i);
			char ccc = T.charAt(i);
			System.out.print(ch);
			System.out.print(ccc);          
		}    
	}
}
