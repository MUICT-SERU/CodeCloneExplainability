import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        
        int[] B =new int[M];
        int[][] A = new int[N][M];
        
        for(int i=0;i<M;i++){
            B[i] =sc.nextInt();
        }
        
        for(int i=0; i<N; i++){
            for(int j=0;j<M;j++){
                A[i][j] =sc.nextInt();
            }
        }
        int cou = 0;
		for(int i=0; i<N; i++) {
			int al = 0;
			for(int j=0; j<M; j++) {
				al += A[i][j]*B[j];
			}
				if(al+C>0) {
					cou++;
				}				
		}
		System.out.println(cou);
        
    }
}
