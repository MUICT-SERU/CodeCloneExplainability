import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main { // Template for CF
    public static class ListComparator implements Comparator<List<Integer>> {

        @Override
        public int compare(List<Integer> l1, List<Integer> l2) {
            for (int i = 0; i < l1.size(); ++i) {
                if (l1.get(i).compareTo(l2.get(i)) != 0) {
                    return l1.get(i).compareTo(l2.get(i));
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        // Check for int overflow!!!!
        // Should you use a long to store the sum or smthn?
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(f.readLine());
        StringTokenizer st = new StringTokenizer(f.readLine());
        long lcm = 1;
        long denom = 0;
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            long a = Integer.parseInt(st.nextToken());
            lcm = lcm(a, lcm);
            list.add(a);
        }
        for (int i = 0; i < N; i++) {
            denom += lcm / list.get(i);
        }
        double ans = (double) lcm / (double) denom;
        out.println(ans);
        out.close();
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}
