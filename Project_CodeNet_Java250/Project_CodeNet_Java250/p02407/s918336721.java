import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = n - 1; i >= 0; i--){
			if(i != n - 1){
				System.out.print(" ");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}