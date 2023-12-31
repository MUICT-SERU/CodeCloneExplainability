import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();

        int a = scanner.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(a);

        int tmp=a;
        int size=hs.size();

        for(int i=0;true;i++) {
        	if(tmp%2==0) {
        		tmp/=2;
        	}else {
        		tmp=tmp*3+1;
        	}
        	hs.add(tmp);

        	if(size==hs.size()) {
        		System.out.println(i+2);
        		break;
        	}else {
        		size=hs.size();
        	}
        }

    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";
        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next() {
            try {
                if (i < s.length) return s[i++];
                String line = br.readLine();
                while (line.equals("")) {line = br.readLine();}
                s = line.split(reg, 0);
                i = 0;return s[i++];
            } catch (Exception e) {e.printStackTrace();}
            return null;
        }
        public int nextInt() {
            try {return Integer.parseInt(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public double nextDouble() {
            try {return Double.parseDouble(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public long nextLong()  {
            try {return Long.parseLong(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
    }
}