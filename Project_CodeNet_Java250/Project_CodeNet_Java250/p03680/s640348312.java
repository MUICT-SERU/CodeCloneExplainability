import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int N = Integer.parseInt(str);
			int[] a = new int[N];
			for(int i = 0;i < N;i++) {
				str = br.readLine();
				a[i] = Integer.parseInt(str);
			}
			int s = 1;
			int count = 0;
			while(true) {
				if(s == 2) {
					break;
				}
				if(count == N) {
					count = -1;
					break;
				}
				s = a[s-1];
				count++;
			}
			System.out.println(count);
		}catch (Exception e) {
			System.exit(0);
		}
	}
}
