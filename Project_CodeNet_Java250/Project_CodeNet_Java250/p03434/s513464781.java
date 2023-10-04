import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for(int i = 0;i < n;i++) a[i] = sc.nextInt();
		Arrays.sort(a, Collections.reverseOrder());
		
		int dif = 0;
		for(int i = 0;i < a.length;i++) {
		    if(i % 2 == 0) dif += a[i];
		    else dif -= a[i];
		}

		System.out.println(dif);
    }
}