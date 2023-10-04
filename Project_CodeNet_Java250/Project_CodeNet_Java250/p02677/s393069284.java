import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int a = fs.nextInt(); int b = fs.nextInt(); int h = fs.nextInt(); int m = fs.nextInt();
        if ((2*Math.PI*((double)h/12)+((double)m/720)*2*Math.PI)>(2*Math.PI*((double)m/60))) {
            System.out.println(Math.sqrt(a*a+b*b-2*a*b*Math.cos((2*Math.PI*((double)h/12)+((double)m/720)*2*Math.PI)-(2*Math.PI*((double)m/60)))));
        } else {
            System.out.println(Math.sqrt(a*a+b*b-2*a*b*Math.cos((2*Math.PI*((double)m/60))-(2*Math.PI*((double)h/12)+((double)m/720)*2*Math.PI))));
        }

    }




    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
