
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int c=1;
		for(;;){
			int n=sc.nextInt();
			if(n==0) break;
			System.out.println("Case"+" "+c+": "+n);
			c++;
		}

	}

}