import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		int max = 0;
		int sum = 0;

		for(int i=0; i<N; i++){
			L[i] = sc.nextInt();
			if(i>0){
				if(L[i] >= L[max]){
					sum += L[max];
					max = i;
				}else{
					sum += L[i];
				}
			}
		}
		if(L[max]<sum){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
