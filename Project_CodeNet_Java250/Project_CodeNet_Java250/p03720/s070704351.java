
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()),
            m = Integer.parseInt(st.nextToken());
        int[] nodes = new int[100];
        for (int i=0 ; i<m ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()),
                b = Integer.parseInt(st.nextToken());
            nodes[a]++;
            nodes[b]++;
        }
        for (int i=1 ; i<=n ; i++) System.out.println(nodes[i]);
    }
}

