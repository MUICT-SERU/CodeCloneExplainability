import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int i, j, w, cnt=0;
		for(i=0; i<N; i++){
			A[i] = sc.nextInt();
		}
		for(i=0; i<N-1; i++){
			for(j=N-1; j>=i+1; j--){
				if(A[j]<A[j-1]){
					w      = A[j];
					A[j]   = A[j-1];
					A[j-1] = w;
					cnt++;
				}
			}
		}
		for(i=0; i<N; i++){
			if(i!=0) System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println();
		System.out.println(cnt);
	}
}