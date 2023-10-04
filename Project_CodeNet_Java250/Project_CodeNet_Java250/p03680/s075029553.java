import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		int nowon = 1;
		int count = 0;
		
		for(int i=0; i<n; i++){
			if (nowon == 2){
				break;
			}
			nowon = a[nowon-1];
			count++;
		}
		
		if (count == n){
			System.out.println(-1);
		}
		else{
			System.out.println(count);			
		}
		
		sc.close();
	}
}
