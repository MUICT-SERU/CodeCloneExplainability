import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int X,Y = 0,Z;
		int sum = 0;
		for(Z=0;Z<=K;Z++){
			S -= Z;
			for(X=0;X<=K&&X<=S;X++){
				Y = S - X;
				if(Y>K)continue;
				sum++;
			}
			S += Z;
		}
		System.out.println(sum);
	}
}