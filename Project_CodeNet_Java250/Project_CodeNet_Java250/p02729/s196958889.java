import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int i=1; i<N; i++) {
			for(int j=i+1; j<=N; j++)
				cnt++;
		}
		
		if(M > 1) {
			for(int i=1; i<M; i++) {
				for(int j=i+1; j<=M; j++)
					cnt++;
			}
		} else {
			cnt += 0;
		}
		
		System.out.println(cnt);
	}

}