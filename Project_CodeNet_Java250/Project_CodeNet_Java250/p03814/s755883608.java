import java.util.Scanner;
 
public class Main {
	static Scanner in = new Scanner(System.in);
 
	public static void main(String[] args) {
		String s = in.next();
		int S = 0, E = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'A'){
				S = i;
				break;
			}
		}
		for(int i = s.length() - 1; i > -1; i--){
			if(s.charAt(i) == 'Z'){
				E = i;
				break;
			}
		}
		System.out.println(E - S + 1);
	}
}