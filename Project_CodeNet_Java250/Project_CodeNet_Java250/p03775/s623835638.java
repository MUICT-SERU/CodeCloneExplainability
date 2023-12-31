import java.util.Scanner;

public class Main {
	
	public static int getDigitsNum(long x){
		return String.valueOf(x).length();
	}

	public static void main(String[] args) {
		
		long N;

		Scanner scanner = new Scanner(System.in);
		N = scanner.nextLong();
		scanner.close();
		
		long maxDivisor = (long)Math.sqrt(N);
		long divisor = 2;
		int minNum = getDigitsNum(N);
		int num;
	
		while(divisor <= maxDivisor){
			if(N % divisor == 0){
				num = Math.max(getDigitsNum(divisor),getDigitsNum(N / divisor));
				if(num < minNum){
					minNum = num;
				}
			}
			divisor++;
		}
		System.out.println(minNum);
	}

}
