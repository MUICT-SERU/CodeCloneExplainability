import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		while(! primeJudg(x)) {
			x++;
		}
		System.out.print(x);
	}

	//素数を判断するメソッド
	public static boolean primeJudg(int a){
		for(int i=2 ; i<a ; i++) {
			if(a%i == 0) {
				return false;
			}
		}
		return true;
	}
}