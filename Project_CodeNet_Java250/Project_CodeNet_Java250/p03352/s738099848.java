import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int ans=1;
		for(int i=2;i<=x;i++) {
			int tmp=i;
			if(tmp*i>x) {
				System.out.println(ans);
				return;
			}
			while(tmp<x) {
				tmp*=i;
				if(tmp*i>x) {
					break;
				}
			}
			if(ans<tmp) {
				ans=tmp;
			}
		}
		System.out.println(ans);
	}
}