import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 0;

		if(n % 1000 == 0) {
			result = 0;
		}else {
			result = 1000 - (n % 1000);
		}

		System.out.println(result);

	}

}
