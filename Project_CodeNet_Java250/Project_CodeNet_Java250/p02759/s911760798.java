import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		
		//入力表示
		 int N= scanner.nextInt();
		 int ans = (N + 1) / 2; 
		 
		 //計算表示
		System.out.println(ans); 
		
		scanner.close();
	}
}