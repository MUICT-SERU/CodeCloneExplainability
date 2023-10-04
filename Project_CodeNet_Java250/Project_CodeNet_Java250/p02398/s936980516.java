import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int count = 0;
		for (int i = a; i <= b; i++){
			if (c % i == 0){
				count += 1;
			}
		}
		System.out.println(builder.append(count));
		

	}

}