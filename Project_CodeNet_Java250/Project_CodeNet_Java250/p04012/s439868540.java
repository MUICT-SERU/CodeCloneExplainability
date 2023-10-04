import java.util.*;

class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.ABC044_B();
	}
	void ABC044_B() {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int[] count = new int[26];
		for (int i=0; i < str.length(); ++i) {
			count[str.charAt(i)-'a']++;
		}
		for(int i=0; i<count.length; ++i){
			if(count[i]%2!=0){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}