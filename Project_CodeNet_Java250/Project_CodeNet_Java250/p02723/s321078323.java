import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			char[] a = in.toCharArray();
			 System.out.println(a[2]==a[3] && a[4]==a[5] ? "Yes" : "No");
		}
	}
}