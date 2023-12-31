import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {


		int N,tmp,maximum = -BIG_NUM,minimum = BIG_NUM;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			N = Integer.parseInt(br.readLine());

			for(int loop = 0; loop < N; loop++){
				tmp = Integer.parseInt(br.readLine());
				maximum = Math.max(maximum, tmp-minimum);
				minimum = Math.min(minimum, tmp);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(maximum);
	}
}

