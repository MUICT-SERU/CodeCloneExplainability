import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		if(a>b){
			System.out.println("a > b");
		}else if(a<b){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
		scn.close();
	}

}