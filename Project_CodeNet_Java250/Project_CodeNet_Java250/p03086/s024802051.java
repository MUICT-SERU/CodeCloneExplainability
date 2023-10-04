import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.lang.management.MemoryType;
import java.math.BigInteger;
import java.util.*;


public class Main {
    static final int INF = Integer.MAX_VALUE;

    static int mergeSort(int[] a,int [] c, int begin, int end)
    {
        int inversion=0;
        if(begin < end)
        {
            inversion=0;
            int mid = (begin + end) >>1;
            inversion+= mergeSort(a,c, begin, mid);
            inversion+=mergeSort(a, c,mid + 1, end);
            inversion+=merge(a,c, begin, mid, end);
        }
        return inversion;
    }


    static int  merge(int[] a,int[]c, int b, int mid, int e)
    {
        int n1 = mid - b + 1;
        int n2 = e - mid;
        int[] L = new int[n1+1], R = new int[n2+1];
        int[] L1 = new int[n1+1], R1 = new int[n2+1];
        //inversion
        int inversion=0;

        for(int i = 0; i < n1; i++) {
            L[i] = a[b + i];
            L1[i] = c[b + i];
        }
        for(int i = 0; i < n2; i++)  {
            R[i] = a[mid + 1 + i];
            R1[i] = c[mid + 1 + i];
        }
        L[n1] = R[n2] = INF;

        for(int k = b, i = 0, j = 0; k <= e; k++)
            if(L[i] <= R[j]){
                a[k] = L[i];
                c[k] = L1[i++];
            }

            else
            {
                a[k] = R[j];
                c[k] = R1[j++];
                inversion=inversion+(n1-i);

            }
        return inversion;

    }

    static int []c;
    static int[] v;
    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

        public static void main (String[]args) throws IOException {
        Scanner in = new Scanner(System.in);
        try(PrintWriter or = new PrintWriter(System.out)){

       char [] a= in.next().toCharArray();
       int max=0,ans=0;
            for (int i = 0; i < a.length; i++) {
                if (a[i]=='A'||a[i]=='T'||a[i]=='G'||a[i]=='C'){
                    ++ans;
                    max= Math.max(max,ans);
                }else{
                    max= Math.max(max,ans);
                    ans=0;
                }
            }
            max= Math.max(max,ans);
            or.println(max);







        }


    }


    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++) {
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec) {
                        f *= 10;
                    }
                }
            }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}

class prog implements Comparable<prog> {

    int skill;
    int indx;
    int pp;

    public prog(int skill, int indx) {
        this.skill = skill;
        this.indx = indx;
        pp = 0;
    }

    @Override
    public String toString() {
        return "prog{" + "skill=" + skill + ", indx=" + indx + ", pp=" + pp + '}';
    }

    @Override
    public int compareTo(prog o) {
        if (skill!=o.skill)
        return skill-o.skill;
        return-( indx-o.indx);
    }
}