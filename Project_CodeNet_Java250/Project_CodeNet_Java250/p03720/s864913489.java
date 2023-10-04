import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] ss0 = br.readLine().trim().split(" ", 0);
		int N = Integer.parseInt(ss0[0]);
		int M = Integer.parseInt(ss0[1]);
		
		int[] city = new int[N];
		for(int i = 0; i < M; i++){
			ss0 = br.readLine().trim().split(" ", 0);
			city[Integer.parseInt(ss0[0])-1] += 1;
			city[Integer.parseInt(ss0[1])-1] += 1;
		}

		StringBuilder sb = new StringBuilder();
		for(int i: city) {
			sb.append(i);
			sb.append(System.getProperty("line.separator"));
		}



        System.out.println(sb);
        return;
    }


}