import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String w =sc.next();
		for(int i=0;i<w.length();i++) {
			int sum=0;
			for(int j=0;j<w.length();j++) {
				if(w.charAt(i)==w.charAt(j)) sum=sum+1;
			}
			if(sum%2!=0) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");

	}

}