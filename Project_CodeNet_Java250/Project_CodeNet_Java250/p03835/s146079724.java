import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int ans = 0;
		for(int X=0;X<=Math.min(K, S);X++){
			for(int Y=0;Y<=Math.min(K, S-X);Y++){
				int Z = S-X-Y;
				if(0<=Z && Z<=K){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
