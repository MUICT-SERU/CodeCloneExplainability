import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = 0, z = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='A') {
				a = i;
				break;
			}
		}
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i)=='Z') {
				z = i;
				break;
			}
		}
		System.out.println(z-a+1);
		sc.close();
	}
}