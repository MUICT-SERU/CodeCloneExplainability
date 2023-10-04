import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] city = new int[N];
		
		for(int i = 0;i < N;i++) city[i] = 0;
		for(int i = 0;i < 2*M;i++) city[sc.nextInt() - 1]++;
				
		for(int i = 0;i < N;i++) System.out.println(city[i]);
	}
}


