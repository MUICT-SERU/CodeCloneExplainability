import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    long money = 100000;
	    while(n!=0){
	        money *= 1.05;
	        if(money%1000>0){
	        	money+=1000;
	        }
	        money /= 1000;
	        money *= 1000;
	        --n;
	    }
        System.out.println(money);
	}
}