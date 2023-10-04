import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        long cntCup = b/c;
        long cntCdown = (a-1)/c;
        long cntC = cntCup - cntCdown;

        long cntDup = b/d;
        long cntDdown = (a-1)/d;
        long cntD = cntDup - cntDdown;

        long e = lcm(c,d);
        long cntEup = b/e;
        long cntEdown = (a-1)/e;
        long cntE = cntEup - cntEdown;

        long cnt = b - a + 1 - cntC - cntD + cntE;
        System.out.println(cnt);

    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
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