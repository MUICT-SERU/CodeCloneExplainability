import java.util.*;
 
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
    	int[] a = new int[n];
    	int min = Integer.MAX_VALUE;
    	for(int i=0; i<n; i++) {
    	    a[i] = Integer.parseInt(sc.next());
    	    int count = 0;
    	    while(a[i] % 2 == 0) {
    	        a[i] /= 2;
    	        count++;
    	    }
    	    if(min > count) min = count;
    	}
    	System.out.println(min);
    }
}