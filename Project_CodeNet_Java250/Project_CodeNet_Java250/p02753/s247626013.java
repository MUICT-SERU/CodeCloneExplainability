                ////////////////////////////////////////////////////
                //                                                //
                //  For her who keeps the fire kindling in me...  //
                //                                                //
                ////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.Collections; 
// import java.util.StringTokenizer;
import java.util.*;
import java.lang.Math;
import java.awt.Point;                            

import java.awt.geom.*;

public class Main{

    static class Pair{
        int x;
        int y;
    }

    public static void main(String args[]){
        try{
            FastReader s = new FastReader();
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
            int i, j, k, x, y, t, n, m, l, fo, so, ev, r, a, b, count, key, size, Pairer, minglob, minloc, beg, ec, oc, end, begl, endr, ld, up, down, maxele, minele;
            long ans, sqrt, q, sum, maxup, maxdown, X, Y, Q, MOD;//, sum2;
            boolean flag, flag2;

            double avg;

             // t = s.nextInt();

              //for(; t>0; t--){

                // n = s.nextInt();

                // int arr[] = new int[n];

                // flag = false;   flag2 = false;
                // ev = -1;    fo = -1; sp = -1; ec=0; oc = 0;
                // for(i=0; i<n; i++){
                //     x = s.nextInt();
                //     if(x%2==0  && ev != -1){
                //         ev = x;
                //         ec++;
                //     }else if(x%2 == 1){
                //         if(fo == -1)
                //             fp = x;
                //         else
                //             so = x;

                //         oc++;
                //     }
                // }o

                String str;
                str = s.nextLine();

                if(str.charAt(0) == str.charAt(1)  &&  str.charAt(1) == str.charAt(2)){
                    w.write("No\n");
                }else
                    w.write("Yes\n");

                

                
            
              //}
            w.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
                
                
//========================================### FAST IO ###=========================================//
class FastReader 
{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader() 
    { 
        br = new BufferedReader(new
                    InputStreamReader(System.in)); 
    } 

    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 

    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 

    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 

    Double nextDouble() 
    { 
        return Double.parseDouble(next());
    } 

    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str;
    } 
}
    //====================================================================================================//