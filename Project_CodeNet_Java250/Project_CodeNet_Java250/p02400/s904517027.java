import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double a=r*r*Math.PI;
		double l=2*r*Math.PI;
		
		System.out.println((String.format("%.6f", a))+" "+(String.format("%.6f", l)));


	}

}
