    import java.util.Scanner;
     
    public class Main {
    	public static void main (String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
    		
    		int count = 0;
    		int ans = 0;
    		
    		for (int i = 105; i <= N; i++) {
    			
    			for (int j = 1; j <= i; j++) {
    			
    			if (i % 2 == 0) {
    				break;
    			}
    			
    			if (i % j == 0) {
    				count++;
    			}
    			
    		    }
    			
    			if (count == 8) {
    				ans++;
    			}
    			
    			count = 0;
    		}
    		
    		System.out.println(ans);
    		
    	}
    }