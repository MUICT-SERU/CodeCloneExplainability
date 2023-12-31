import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        FastScanner fs=new FastScanner();
        int T=fs.nextInt();
        /*
        for (int tt=0; tt<T; tt++) {

        }
         */
        if (T % 1000 == 0) {
            System.out.println("0");
        } else {
            int round = (1 + (T / 1000)) * 1000;
            System.out.println(round - T);
        }
    }

    void sort(int[] a) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i:a) list.add(i);
        Collections.sort(list);
        for (int i=0; i<a.length; i++) a[i]=list.get(i);
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();

        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] readLongArray(int n) {
            long[] a=new long[n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }
    }
}