import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			//2???????????¶??°???????????????
			int numX = sc.nextInt();
			int numY = sc.nextInt();

			//0??????????????§??????????±???????
			int output = 0;
			int checkNum = 0;
			do {
				//??°????????????
				if (numX >= numY) {
					checkNum = numX % numY;
					numX = checkNum;
				}else{
					checkNum = numY % numX;
					numY = checkNum;
				}
			} while (checkNum != 0);
			//???????????????
			output = Math.max(numX, numY);
			System.out.println(output);
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}