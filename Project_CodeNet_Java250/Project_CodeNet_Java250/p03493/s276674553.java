import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	sc.close();
	
	int cnt = 0;
	for(int i=0;i<3;i++)if (S.charAt(i)=='1') cnt++;
	System.out.println(cnt);
	
	}
}
