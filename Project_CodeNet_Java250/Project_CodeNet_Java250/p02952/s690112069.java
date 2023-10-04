import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= N; i++) {
			if((int)Math.floor(Math.log10(i) + 1) % 2 == 1) {
				result++;
			}
		}
		System.out.println(result);
		sc.close();
	}

}
/*
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□■■□□
■■■■■■□□□■□■■■□□□
□□□□□■□□□■■■□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□■■■□□□■□□□□□□□
□■■■□■□□□■□□□□□■□
■■□□□■□□□■■□□□■■□
□□□□□■□□□□■■■■■□□
□□□□□■□□□□□□□□□□□
□□□□□□□■□□□□□□□□□
□□□□□□□■□□□□□□□□□
□□□□□□□■□□□□□□□□□
□□□□□□□■□□□□□□□□□
□□□□□□□■□□□□□□□□□
■■■■■■■■■■■■■■■■□
□□□□□□□■□□□□□□□□□
□□□□□□■■■□□□□□□□□
□□□□□□■□■□□□□□□□□
□□□□□□■□■■□□□□□□□
□□□□□■■□□■□□□□□□□
□□□□□■□□□■■□□□□□□
□□□□■■□□□□■■□□□□□
□□□■■□□□□□□■■□□□□
□□■■□□□□□□□□■■□□□
■■■□□□□□□□□□□■■■□
*/