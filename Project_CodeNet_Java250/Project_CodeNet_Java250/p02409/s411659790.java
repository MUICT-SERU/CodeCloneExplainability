import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		int kosha[][][] = new int[4][3][10];
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// ??\???????????????????´?
		for(int i=1; true; i++){
			//??¶??°????¶???????????????????
			if (i > n) break;
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			int A = a-1;
			int B = b-1;
			int C = c-1;
			int D = kosha[A][B][C];
			kosha[A][B][C] = D + d;
		}
		
		//?????????
		for (int A=0; true; A++){
			for(int B=0; B<=2; B++){
				for(int C=0; C<=9; C++){
					System.out.print(" " + (kosha[A][B][C]));
				}
				System.out.println("");
			}
			if (A==3) break;
			System.out.println("####################");
		}
		
	}

}