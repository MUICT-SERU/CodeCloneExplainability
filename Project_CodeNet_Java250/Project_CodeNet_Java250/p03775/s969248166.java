import java.util.Scanner;
 
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		long N = in.nextLong();
		
		int min	 = Integer.MAX_VALUE;
		for(int i = 1; i <= (int)Math.sqrt(N); i++){
			if(N % i == 0){
				int j = (int)(N / i);
				min = Math.min(min, Math.max(String.valueOf(j).length(), String.valueOf(i).length()));
			}
		}
		System.out.println(min);
		
	}
}