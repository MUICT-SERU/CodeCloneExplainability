import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++) {
			int m =a.charAt(i)-'a';
			if(m==25)
				System.out.print('z');
			else {
				System.out.print((char)(m+1+'a'));
			}
		}
	}
	
}