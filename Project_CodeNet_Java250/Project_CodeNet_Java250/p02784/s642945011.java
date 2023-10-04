/* package codechef; // don't place package name! */

import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int N = s.nextInt();
        int A[] = new int[N];
        int sum=0;
        for(int i=0; i<N; i++)
        {
            A[i] = s.nextInt();
            sum+=A[i];
        }
        if(sum>=H)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}