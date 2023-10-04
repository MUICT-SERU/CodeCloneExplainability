import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int n = Integer.parseInt(strlist[0]);
		int m = Integer.parseInt(strlist[1]);
		int[] list = new int[n];
		Arrays.fill(list, 0);

		int a,b;

		for(int i=0; i<m; i++){
			str = input.readLine();
			strlist = str.split(" ");
			a = Integer.parseInt(strlist[0]);
			b = Integer.parseInt(strlist[1]);
			list[a-1]++;
			list[b-1]++;
		}

		for(int i=0; i<n; i++){
			System.out.println(list[i]);
		}

	}


}
