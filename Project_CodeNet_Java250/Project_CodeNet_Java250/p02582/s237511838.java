import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int r = 0;
		for(int i=0; i < 3; i++) {
			if(s.charAt(i)=='R') {
				if(i==2&&s.charAt(1)=='S')r=0;
				r++;
			}
		}
		System.out.println(r);
	}
}
