import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int x,y;

		while ( 0 != ( x = sc.nextInt() ) | 0 != ( y = sc.nextInt() ) ) {
			if ( x < y )
				sb.append( x + " " + y + "\n" );
			else
				sb.append( y + " " + x + "\n" );
		}

		System.out.print(sb);
	}

}