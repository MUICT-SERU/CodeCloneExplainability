/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
If I'm the sun, you're the moon
Because when I go up, you go down
*******************************
I'm working for the day I will surpass you
https://www.a2oj.com/Ladder16.html
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         int T = Integer.parseInt(infile.readLine());
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
         for(int i=N; i <= M; i++)
            if(i%T == 0)
            {
               System.out.println("OK");
               return;
            }
         System.out.println("NG");
      }
   }