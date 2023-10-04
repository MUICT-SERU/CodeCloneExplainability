import java.util.*;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] mp = new int[n+1];
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==b) mp[a]++;
			else {
				mp[a]++;
				mp[b]++;
			}
		}
		for(int i=1; i<mp.length; i++) {
			System.out.println(mp[i]);
		}
	}
}