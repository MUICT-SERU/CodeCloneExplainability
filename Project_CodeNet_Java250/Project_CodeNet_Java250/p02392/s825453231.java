import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			x = in.readLine();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] ab = x.split(" ");
		
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		int c = Integer.parseInt(ab[2]);

		if ((a < b) && (b < c)) System.out.println("Yes");
		else System.out.println("No");
	}
}