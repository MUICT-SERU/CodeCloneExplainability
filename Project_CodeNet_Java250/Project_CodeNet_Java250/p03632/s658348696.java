import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
  public static void main(String... args){
    int[] t = new int[4];
    FastScanner fs = new FastScanner();
    for(int i = 0;i<4;i++){t[i] = fs.nextInt(); }

      if(t[0] < t[2] && t[1] < t[2] || t[2] < t[0] && t[3] < t[0]) System.out.println("0");
      else{
        Arrays.sort(t);
        System.out.println(t[2]-t[1]);
      }
  }
}
class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextToken() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine(){
			String line = "";
			try{
				line = br.readLine();
			}catch(IOException e){
				e.printStackTrace();
			}
			return line;
		}

		int nextInt() {
			return Integer.parseInt(nextToken());
		}

		long nextLong() {
			return Long.parseLong(nextToken());
		}

		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}
