import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			String cards = sc.nextLine();
			if ( cards.equals("-") ) break;
			int m = sc.nextInt();

			for ( int i=0; i < m; i++) {
				int h = sc.nextInt();
				String car = cards.substring(0, h);
				String ds = cards.substring(h);
				cards = ds + car;
			}
			sc.nextLine(); // nextInt()??????????????£?????????\n????¶????????????????

			sb.append(cards + "\n");
		}

		System.out.print(sb);
	}

}