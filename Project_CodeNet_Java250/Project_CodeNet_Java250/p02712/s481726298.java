import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long cnt =0;
		for (long i = 1; i < N+1; i++) {
			if (i%3==0||i%5==0) {
				
			}else{
				cnt += i;
			}
		}
		System.out.println(cnt);
		sc.close();
    }	
		
}