import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] number = line.split(" ");
        int n = Integer.parseInt(number[0]);
        int m = Integer.parseInt(number[1]);
        int[] a = new int[n];
        int k = 0;
        int l = 0;
        for(int i = 0; i < m; i++) {
            line = br.readLine();
            k = Integer.parseInt(line.split(" ")[0]);
            l = Integer.parseInt(line.split(" ")[1]);
            a[k - 1]++;
            a[l - 1]++;
        }
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}