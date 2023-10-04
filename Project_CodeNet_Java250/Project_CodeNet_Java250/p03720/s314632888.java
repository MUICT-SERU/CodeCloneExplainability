import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] s = str.split(" ",0);
			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);
			int[] road = new int[N];
			Arrays.fill(road, 0);
			for(int i = 0; i < M;i++) {
				str = br.readLine();
				s = str.split(" ",0);
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				road[a-1]++;
				road[b-1]++;
			}

			for(int i = 0; i < N;i++) {
				System.out.println(road[i]);
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}
}
