import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		char [] w = sc.next().toCharArray();
		char [] a = new char [26];
		int  [] c = new int  [26];
		int n = 0;
		boolean h = true; 
		boolean s = true; 
		
		for(int i = 0; i < w.length; i++){	
		h = true;
		for(int j = 0; j < a.length; j++){
		if( w[i] == a[j] ) { h = false; }  
		}
		if(h){
		a[n] = w[i]; 
		for(int j = 0; j < w.length; j++){
		if(w[i] == w[j]){ c[n] += 1; }}
		n += 1;
		}
		}
		
		for(int i = 0; i < n; i++){	
		if( c[i] % 2 == 0 ){} else { s = false; }}
		
		if(s){ System.out.print("Yes"); } else { System.out.print("No"); }
	}}