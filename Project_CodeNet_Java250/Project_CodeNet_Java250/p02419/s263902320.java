import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.next().toLowerCase();
		int cnt = 0;
		
		while(sc.hasNext()){
			String T = sc.next().toLowerCase();
			if(T.equals(W)){
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}