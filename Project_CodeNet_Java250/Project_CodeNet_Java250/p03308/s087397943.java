import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[]=new int [n];
		
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println(a[n-1]-a[0]);
	}
}
