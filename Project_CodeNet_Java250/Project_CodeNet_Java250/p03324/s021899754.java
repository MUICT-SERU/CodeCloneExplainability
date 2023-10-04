import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.math.*;

public class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        final Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null)
                br.close();
        }

        public String next() throws IOException {
            if (i < s.length)
                return s[i++];
            String st = br.readLine();
            while (st == "")
                st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }

    private void solve() {
        try {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0) {
                if (b != 100) {
                    System.out.println(b);
                } else {
                    System.out.println(101);
                }

            } else if (a == 1) {
                if (b != 100) {
                    System.out.println(b * 100);
                } else {
                    System.out.println(10100);
                }
            } else {
                if (b != 100) {
                    System.out.println(b * 10000);
                } else {
                    System.out.println(1010000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
