import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		long d, r;//d = ??????r = ?????????
		double f;//f = ???????°???°
		long a = scan.nextInt();//a = ??????????????°
		int b = scan.nextInt();//b = ????????°

		d = a / b;
		r = a % b;
		f = (double)a / b;

		System.out.println(String.format("%d %d %f", d, r, f));
		
        scan.close();
    }

}