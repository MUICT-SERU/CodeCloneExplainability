import java.math.BigInteger;
import java.util.*;
public class Main {
	static Map<Long,ArrayList<String>> l=new TreeMap<Long,ArrayList<String>>();
	static long p[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
	
	
}

 
