import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//split??????????????§????????????????§£????????£??\
		String[] lines = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(lines[0]);
		int num2 = Integer.parseInt(lines[1]);
		int num3 = Integer.parseInt(lines[2]);
		//???????????£??\??????result?????£?¨????
		String result;

		//????????¶??????????????????????????£??\???
		if(num1 < num2 && num2 < num3){
			result = "Yes";
		} else {
			result = "No";
		}

		//???????????¨??????
		System.out.println(result);

	}
}