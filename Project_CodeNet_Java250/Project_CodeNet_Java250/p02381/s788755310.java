import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);

		while(true){

			//?????°?????????
			int n = scan.nextInt();
			//????????¢???????´?????????????
			double[] score = new double[n];
			//????¨????????????????????????°
			double total = 0.0;
			//?????????????????????????????°
			double average = 0.0;
			//?????£????????????????????°
			double var = 0.0;
			//?¨?????????????????????????????????°
			double result = 0.0;

			//???????????¶
			if(n==0){
				scan.close();
				break;
			}else{

				for(int i = 0; i < n; i++){
					score[i] = scan.nextDouble();
					total += score[i];
				}
				//?????????
				average = total / n;
				//?????£????¨????
				double temp = 0.0;
				for(int j = 0; j < n; j++){
					temp += Math.pow(score[j] - average ,2);
				}
				var = temp/n;
			}

			//?¨?????????????????±?????????¬???
			//?????£????????????????±???????
			result = Math.sqrt(var);
			System.out.println(result);
		}
	}

}