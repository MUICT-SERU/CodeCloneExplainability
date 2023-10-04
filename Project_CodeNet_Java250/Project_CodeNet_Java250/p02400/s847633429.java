import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		double r = cin.nextDouble();
		
		System.out.printf("%.6f %.6f\n", cal_area(r), cal_cirum(r));
	}
	
	private static double cal_area(double r){
		double pi = Math.PI;
		return (r * r * pi);
	}
	
	private static double cal_cirum(double r){
		double pi = Math.PI;
		return (2 * r * pi);
	}
}