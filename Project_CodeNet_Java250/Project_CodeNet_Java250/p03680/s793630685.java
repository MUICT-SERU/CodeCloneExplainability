import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.nextInt());
		int a[] = new int[N];
		int i;

		for(i=0; i<N; i++){
			a[i] = sc.nextInt();
		}

		int judge=0;
		i = 0;
		int count=0;
		while(judge != 2){
			judge = a[i];
			count++;
			i = judge-1;
			if(count > N) break;
		}
		if(count<N){
			System.out.println(count);
		}
		else{
			System.out.println(-1);
		}
	}
}