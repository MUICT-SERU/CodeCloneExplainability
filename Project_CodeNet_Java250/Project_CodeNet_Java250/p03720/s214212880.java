import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int b = sc.nextInt();
			int a = sc.nextInt();
			
			int intArray[][] = new int[a][2];
			for (int i = 0; i < a;i ++ ){
				intArray[i][0] = sc.nextInt();
				intArray[i][1] = sc.nextInt();
			}

			
			int intArray2[] = new int[b];
			for (int i = 0; i < b;i ++ ){
				intArray2[i] = 0;
			}
			
			for (int i = 0; i < a;i ++ ){
				intArray2[intArray[i][0] - 1] ++ ;
				intArray2[intArray[i][1] -1 ] ++ ;
			}

			for (int i = 0; i < b;i ++ ){
				System.out.println(intArray2[i]);
			}

		}
}
