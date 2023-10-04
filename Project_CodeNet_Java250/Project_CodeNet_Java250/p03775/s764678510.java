import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		long a,a_len;
		long b,b_len;
		long min = 99999999;
		
		for(long i=(long) Math.sqrt(N);i>=1;i--){
			if(N % i == 0){
				a = i;
				b = N / i;
				
				a_len = String.valueOf(a).length();
				b_len = String.valueOf(b).length();
				
				if(a_len > b_len){
					min = a_len;
				}else{
					min = b_len;
				}
				break;
			}
		}
		
		System.out.println(min);
	}

}
