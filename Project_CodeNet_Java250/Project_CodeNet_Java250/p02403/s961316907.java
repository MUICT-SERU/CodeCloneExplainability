import java.util.*;

class Main{
	public static void main(String args[]){
		int H, W;
		Scanner scan = new Scanner(System.in);

		while(true){
			H = scan.nextInt();
			W = scan.nextInt();
			
			if(H == 0 && W == 0){break;}

			for(int i=0; i<H; i++){
				for(int k=0; k<W; k++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}