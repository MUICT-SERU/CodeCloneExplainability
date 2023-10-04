import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String integers = br.readLine();
			System.out.println(compare(integers));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String compare(String integers) {
		String[] integerss = integers.split(" ");
		int a = Integer.parseInt(integerss[0]);
		int b = Integer.parseInt(integerss[1]);
		if (a < b) {
			return "a < b";
		} else if (a > b) {
			return "a > b";
		}
		return "a == b";
	}
}
