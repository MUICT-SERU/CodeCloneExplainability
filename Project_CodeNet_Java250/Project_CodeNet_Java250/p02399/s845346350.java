import java.util.Scanner;
import java.lang.Object;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int d=a/b;
		int r=a%b;
		double f=(double)a/b;
		System.out.print(d+" "+r+" ");
		System.out.println(BigDecimal.valueOf(f).toPlainString());
	}
}