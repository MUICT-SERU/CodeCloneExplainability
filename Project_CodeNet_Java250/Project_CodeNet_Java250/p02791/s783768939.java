import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int answer = 1;
		int before = sc.nextInt();
		for(int i =1;i < count; i++) {
			int after = sc.nextInt();
			if(before >= after) {
				answer++;
				before = after;
			}
		}
		System.out.println(answer);
	}
}
