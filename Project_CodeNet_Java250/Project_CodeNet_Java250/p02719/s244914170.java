
import java.util.*;

class Main {
    
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long ans = 0;
        ans = Math.min(K - N % K, N % K);
        
        
        System.out.println(ans);

	}

	
}
		
	
