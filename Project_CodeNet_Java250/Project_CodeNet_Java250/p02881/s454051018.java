import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();

		if(prime(n)) {
			System.out.println(n-1);
		}else {
			for(long i=(long)Math.sqrt(n);i>1;i--) {
				if(n%i==0) {
					System.out.println(i+n/i-2);
					break;
				}
			}
		}
	}
	public static boolean prime(long n) {
		if(n==1 || n==2)return true;
		else if(n%2==0)return false;

		for(int i=3;i<=Math.sqrt(n);i+=2) {
			if(n%i==0)return false;
		}
		return true;
	}
}

