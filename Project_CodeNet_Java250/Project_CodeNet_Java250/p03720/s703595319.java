import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	//都市
		int M = sc.nextInt();	//本数
		
		int a[] = new int[M*2];
		
//		System.out.println(a.length);
		
		for (int i=0; i<M*2; i=i+2){
			a[i] = sc.nextInt();
			a[i+1] = sc.nextInt();
		}
		
		int ans[] = new int[N];
		for (int i=1; i<N+1; i++){
			
			for(int j=0; j<M*2; j++){
				
				if(i==a[j]){
					ans[i-1]++;
				}
				
				
			}
			
		}

		for (int i=0; i<N; i++){
			System.out.println(ans[i]);
		}
		
		

	}

}
