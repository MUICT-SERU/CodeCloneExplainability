import java.util.Scanner;
//???????????´??° W???H???x???y???r 
public class Main {
		static int W = 0;
		static int H = 0;
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		W = sc.nextInt();
		H = sc.nextInt();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		if(x <= 0 || y <= 0){
			if(r < 0){
				System.out.println("No");				
			}else if(r == 0){
				System.out.println("Yes");				
			}
			System.out.println("No");
		}else if(x + r <= W  && y + r <= H ){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
		
		sc.close();
	}

}