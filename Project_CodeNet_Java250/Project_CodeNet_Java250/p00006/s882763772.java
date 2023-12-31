import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {

			char[] input = line.toCharArray();

			for (int i = input.length; i > 0; i--) {
				System.out.print(input[i - 1]);
			}
			System.out.println();
		}
	}
}