import java.util.Scanner;

public class Main {

	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		String[] s = new String[3];
		for (int i = 0;i < 3 ; i++ ) {
			s[i] = sc.next();
		}
		int p = 0;
		while(s[p].length() != 0){
			int np = s[p].charAt(0)-'a';
			s[p] = s[p].substring(1,s[p].length());
			// else s[p] = "";
			p = np;
		}
		System.out.println((char)('A'+p));
	}

}