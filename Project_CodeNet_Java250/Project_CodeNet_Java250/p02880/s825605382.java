import java.util.Scanner;

public class Main {
	
	
	static void canMultiply(int a) {
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(a==j*i) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
		
		
	}
		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			
			
			int a,b;
			a=sc.nextInt();
			
			canMultiply(a);
			
			
		
		
		
		}

}
