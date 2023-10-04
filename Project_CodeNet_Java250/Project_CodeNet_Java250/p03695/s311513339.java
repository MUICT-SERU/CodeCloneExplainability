import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		boolean[] rate = new boolean[8];
		int free =0;
		int a;
		for(int i=0; i<N; i++){
			a  = in.nextInt();
			if(a<=399){
				rate[0]=true;
			}else if(a<=799){
				rate[1]=true;
			}else if(a<=1199){
				rate[2]=true;
			}else if(a<=1599){
				rate[3]=true;
			}else if(a<=1999){
				rate[4]=true;
			}else if(a<=2399){
				rate[5]=true;
			}else if(a<=2799){
				rate[6]=true;
			}else if(a<=3199){
				rate[7]=true;
			}else{
				free++;
			}
		}
		int ans=0;
		for(int i=0; i<rate.length; i++){
			if(rate[i]==true){
				ans++;
			}
		}
		int max = ans+free;
		if(ans == 0){
			ans = 1;
		}
		System.out.println(ans + " " + max);
	}
}