import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ac=0,wa=0,tle=0,re=0;
		
		for (int i = 0; i < n; i++) {
			String s=sc.next();
			
			if(s.equals("AC")) ac++;
			else if(s.equals("WA")) wa++;
			else if(s.equals("TLE")) tle++;
			else re++;
		}
		System.out.println("AC x "+ac);
		System.out.println("WA x "+wa);
		System.out.println("TLE x "+tle);
		System.out.println("RE x "+re);
	}
}
