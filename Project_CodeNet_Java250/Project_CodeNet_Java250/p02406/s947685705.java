import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			if(i % 3 == 0 || (i + "").contains("3")){
				System.out.print(" " + i);
			}
		}
		System.out.println();
	}

}