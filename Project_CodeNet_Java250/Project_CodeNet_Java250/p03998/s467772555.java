import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next(), c = sc.next();
		char t = 'a';
		int ac = 0, bc = 0, cc = 0;		
		while(true){
			if(t == 'a'){
				if(ac == a.length()){
					System.out.println("A");
					break;
				}
				t = a.charAt(ac);
				ac++;
			}else if(t == 'b'){
				if(bc == b.length()){
					System.out.println("B");
					break;
				}
				t = b.charAt(bc);
				bc++;
			}else if(t == 'c'){
				if(cc == c.length()){
					System.out.println("C");
					break;
				}
				t = c.charAt(cc);
				cc++;
			}
		}
	}
}