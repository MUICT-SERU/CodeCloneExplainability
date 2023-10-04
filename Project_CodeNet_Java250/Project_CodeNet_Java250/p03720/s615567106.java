import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int c[] = new int[n];
		for(int i = 0; i < n; i++)
			c[i] = 0;
		
		for(int i = 0; i < m * 2; i++){
			int temp = sc.nextInt();
			for(int j = 0; j < n; j++)
				if(j + 1 == temp){
					c[j]++;
					break;
				}
		}
		
		for(int i = 0; i < n; i++)
			System.out.println(c[i]);
	}
 
}