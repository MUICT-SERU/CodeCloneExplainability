import java.util.Scanner;

public class Main{
	public static void main(String args[]){


		Scanner sc = new Scanner(System.in);
		int intW = sc.nextInt();
		int intH = sc.nextInt();
		int intX = sc.nextInt();
		int intY = sc.nextInt();
		int intR = sc.nextInt();
		int intAns = 0;

		//????????´???????????????????????£????????¶??????????§???¢?????\??£????????????
		if(intX < 0){
			intAns = 1;
		}
		if(intY < 0){
			intAns = 1;
		}

		//?¨???????????????????????????????????¢????
		if(intX - intR < 0){
			intAns = 1;
		}
		if(intX + intR > intW){
			intAns = 1;
		}

		//?????????????????????????????????????¢????
		if(intY - intR < 0){
			intAns = 1;
		}
		if(intY + intR > intH){
			intAns = 1;
		}

		if(intAns == 1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}