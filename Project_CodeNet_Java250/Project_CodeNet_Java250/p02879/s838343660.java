import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken()), n2 = Integer.parseInt(st.nextToken());

		if (n1 > 9 || n2 > 9) {
			System.out.println("-1");
		} else {
			System.out.println(n1 * n2);
		}
	}
}
