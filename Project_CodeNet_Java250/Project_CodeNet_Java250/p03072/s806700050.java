/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{

        // usual use input int
        static int n;
        static int m;
        static int ni;
        static int hi;
        static int wi;
        static int lefi;
        static int rigi;
        static int ansi;
        //
        static String s;
        static String t;
        static String anss;
        // 
        static String[] sAr;
        //
        static long ansl;
        //
        static int[] ari;
        //
        static int[][] sqari;
        //

        // for dfs
        static int[] w;
        static int[] ww;
        static boolean[] isvisited;
        //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
        int n = sc.nextInt();
        int[] h = new int[n];
        int tm;
        ansi = 1;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        tm = h[0];

        for (int i = 1; i < n; i++) {
            if (h[i] >= tm) {
                ansi++;
                tm = h[i];
            }
        }
        System.out.println(ansi);
        sc.close();
    }


        public static int gcd_int(int a, int b) {
        
            if (a < b) {
                int tmpp = a;
                a = b;
                b = tmpp;
            }
            if (b == 0) {
                return a;
            }else{
                return gcd_int(b, a%b);
            }
        } 

        public static long gcd_long(long a, long b) {
        
            if (a < b) {
                long tmpp = a;
                a = b;
                b = tmpp;
            }
            if (b == 0) {
                return a;
            }else{
                return gcd_long(b, a%b);
            }
        }

        public static int lcm_int(int a, int b) {
            int gcd = gcd_int(a,b);
            return a/gcd*b;
        }

        public static long lcm_long(long a, long b) {
            long gcd = gcd_long(a,b);
            return a/gcd*b;
        }

        public static void dfs(int placenow) {
            // if went all -> success! 
            // if not went all -> fail...
            
            /*
            dfs    
            Go All Place that there is way to and not having been yet. 

             if island 1 is start point, dfs(1);
            if there is way to island 2 and island 3,
            - island 2 changes non-visited -> visited, and dfs(2).
            - island 3 changes non-visited -> visited, and dfs(3).
    
            */

            isvisited[placenow] = true;
            boolean success = true;
            for (int i = 0; i < n; i++) {
                if (isvisited[i] == false) { // not go all place
                    success = false;
                    break;
                }
            }
            if (success) {
                ansi++;
                isvisited[placenow] = false;
                return;
            }

            for (int i = 0; i < n; i++) {
                if (w[i] == placenow && isvisited[ww[i]] == false ) {
                    dfs(ww[i]);
                }else if(ww[i] == placenow && isvisited[w[i]] == false){
                    dfs(w[i]);
                }else{
                    continue;
                }
            }
            isvisited[placenow] = false;
            return;
        }

}

