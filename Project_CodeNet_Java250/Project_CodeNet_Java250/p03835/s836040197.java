import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int c = 0;
		for(int x = 0; x <= K; x++) {
			for(int y = 0 ; y <= K; y++) {
				int z = S - x - y;
				if(0 <= z && z <= K) {
					c += 1;
				}
			}
		}
		System.out.println(c);
	}
}