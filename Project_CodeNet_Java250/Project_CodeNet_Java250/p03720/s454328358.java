import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] ary = new int[2*M];
		for (int i =0; i <ary.length; i++){
			ary[i] = scan.nextInt();
		}
		for(int i=1; i <= N; i++){
			int cnt=0;
			for(int j : ary){
				if( j == i ) cnt++;
			}
			System.out.println(cnt);
		}
	}

}