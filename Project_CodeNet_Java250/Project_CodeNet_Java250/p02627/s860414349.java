import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		
		char ans;
		if (a < 'a')
			ans = 'A';
		else
			ans = 'a';
			
		System.out.println(ans);
	}
}

