import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//Scanner????????????????????????
		Scanner scan = new Scanner(System.in);
		//A????????????(n,m)
		int n = scan.nextInt();
		int m = scan.nextInt();

		//a?????????
		int[][] aAry = new int[n][m];
		for(int i = 0; i < n; i++){

			for(int j = 0; j < m; j++){
				aAry[i][j] = scan.nextInt();
			}
		}

		//b?????????
		int[] bAry = new int[m];
		//?????????????´?
		for(int i = 0; i < m; i++ ){

			bAry[i] = scan.nextInt();
		}

		scan.close();

		//?????????????????\???????????°
		int intAnswer = 0;

		for(int i =0; i < n; i++){
			//?????????????????\???????????°
			int intResult = 0;
			for(int j = 0; j < m; j++){
				//???????????????????????£??\
				intAnswer = bAry[j] * aAry[i][j];
				intResult = intResult + intAnswer;
			}
			System.out.println(intResult);
			//intResult????????????
			//intResult = 0;
		}


	}
}