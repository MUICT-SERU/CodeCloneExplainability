import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner (System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0;i<n;i++){
			A[i] = sc.nextInt();
			h -=A[i];
		}
		if(h<=0){
			System.out.println("Yes");	
		}else{
			System.out.println("No");
		}
	}
}