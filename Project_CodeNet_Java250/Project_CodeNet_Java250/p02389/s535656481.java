import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		int a, b, area, length;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		// 1??????????????§???????????????????????????????????????????????????????´??????????
		String[] strArray = str.split(" ");

		a = Integer.parseInt(strArray[0]);
		b = Integer.parseInt(strArray[1]);

		area = a*b;
		length = (a*2) + (b*2);

		System.out.println(area + " " + length);
	}
}