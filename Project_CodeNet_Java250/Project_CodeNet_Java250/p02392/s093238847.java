import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if(a<b&&b<c){
			System.out.println("Yes");
		}else
			System.out.println("No");
		scn.close();
	}

}