import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0, m = 0;
		int b = 0;
		int temp1 = 0;
		int temp2 = 0;
		int sum = 0;
		int count1 = 0;
		int count2 = 0;
		String str;
		ArrayList<String> st = new ArrayList<String>(); // ??\?????????????????????b,f,r,v
		ArrayList<Integer> parse = new ArrayList<Integer>(); // int??????
		/**
		 * ???????????\???(n*m??????)
		 */
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); // n,m????±????
		m = scan.nextInt();
		int matrix[][] = new int[n][m];
		int vector[] = new int[m];
		int anser[] = new int[n];
		// System.out.println(n+" "+m);
		for (int a = 0; a < n; ++a) { // ??\?????¶??°????????????
			for (int t = 0; t < m; ++t) { // ??\??????????????????????????????????????????????´?
				st.add(scan.next());
			}
			for (int p = count1; p < st.size(); ++p) { // String???Int??????
				str = st.get(p);
				temp1 = Integer.parseInt(str);
				parse.add(temp1);
				//System.out.println("parse[" + p + "] = " + parse.get(p));
			}
			count1 += m;
		}
		for (int k = 0; k < n; ++k) { // n*m??????????????????????????\
			for (int l = 0; l < m; ++l) {
				matrix[k][l] = parse.get(count2++);
				//System.out.println("matrix[" + k + "][" + l + "] : " + matrix[k][l]);
			}
		}
		/**
		 * ???????????\???(m*1????????????)
		 */
		for (int i = 0; i < m; ++i) {
			b = scan.nextInt();
			vector[i] = b;
		}
		/**
		 * ?¨???? n*m???????????¨m*1????????????????????????n*1????§£????±?????????????
		 */
			for (int d = 0; d < n; ++d) {
				for (int f = 0; f < m; ++f) {
					sum += matrix[d][f] * vector[f];
				}
				anser[d] = sum;
				System.out.println(anser[d]);
				sum = 0;
		}

	}
}