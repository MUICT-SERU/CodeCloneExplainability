import java.util.Scanner;
	public class Main
		{ public static void main(String[] args)
			{   
			    Scanner scanner = new Scanner(System.in);
			    int N = scanner.nextInt();
			    int[] a = new int[N];
			    int count = 0;
			    int v = 1;
			    int flg = 0;
			    
			    for (int i = 0; i < N; i++) {
			    	a[i] = scanner.nextInt();
			    } 
			    
			    for (int i = 0; i < N; i++) {
			    	v = a[v-1];
			    	
			    	count ++;
			    	if (v == 2) {
			    		System.out.println(count);
			    		count = 0;
			    		break;
			    	}
			    	
			    }
			    
			    if (count == N) {
			    	System.out.println(-1);
			    }
		}
		}