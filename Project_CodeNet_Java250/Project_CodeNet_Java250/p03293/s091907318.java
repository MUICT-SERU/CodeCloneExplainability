import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		int len = s.length();
		
		for(int i = 0; i < len; i++){
			String s1 = s.substring(0, i);
			String s2 = s.substring(i, len);
			
			String rot = s2 + s1;
			
//			System.out.println(s2+" + "+s1+ " = "+rot);
			if(rot.equals(t)){
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}
}
