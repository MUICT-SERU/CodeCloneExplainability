import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String sa = sc.next();
		String sb = sc.next();
		String scc = sc.next();
		int a=0,b=0,c=0,turn=0;
		for(;;) {
			if(turn==0) {
				if(sa.length()==a){
					System.out.println('A');
					break;
				}
				turn =sa.charAt(a)-'a';
				a++;
			}else if(turn==1) {
				if(sb.length()==b) {
					System.out.println('B');
					break;
				}
				turn =sb.charAt(b)-'a';
				b++;
			}else{
				if(scc.length()==c) {
					System.out.println('C');
					break;
				}
				turn = scc.charAt(c)-'a';
				c++;
			}
		}

	}

}