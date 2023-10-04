import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt()-1;
		}
		
		boolean[] use = new boolean[N];
		int id = 0;
		int count = 0;
		while(true) {
			if(use[id]) {
				count = -1;
				break;
			}
			if(id == 1) {
				break;
			}
			use[id] = true;
			count++;
			id = a[id];
		}
		System.out.println(count);
		
	}
}