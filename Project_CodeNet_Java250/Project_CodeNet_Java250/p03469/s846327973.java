import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		String ans =S.replace( "2017", "2018" ) ;

		System.out.println( ans );
	}
}