import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// ??????10??????
		 int debt = 100000;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// n??±??????
		int n = Integer.parseInt(br.readLine());

		// n??±????????????????????§??°?????????
		for (int i = 0; i < n; i++ ){
			// ??????5
			debt *= 1.05;

			// 1000?????????????????????
			if (debt % 1000 > 0) {
				debt = debt - (debt % 1000) + 1000;
			}
		}

		System.out.println(debt);
	}
}