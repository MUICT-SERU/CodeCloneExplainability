import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long sq=(long)(Math.sqrt(n)+0.0001);
		while(true){
			if(n%sq==0){
				break;
			}
			sq--;
		}
		System.out.println((int)Math.log10(n/sq)+1);
	}

}