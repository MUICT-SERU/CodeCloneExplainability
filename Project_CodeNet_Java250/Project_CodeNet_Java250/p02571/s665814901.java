
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		int m = t.length();
		for( int i=0 ; i<s.length()-t.length()+1 ; i++ ) {
			int c=0;
			for( int j = 0; j<t.length() ; j++ ) {
				if( s.charAt(i+j) != t.charAt(j)) {
					c++;
				}
			}
			if( m > c ) {
				m = c;
			}
		}
		
		System.out.println(m);
	}
}
