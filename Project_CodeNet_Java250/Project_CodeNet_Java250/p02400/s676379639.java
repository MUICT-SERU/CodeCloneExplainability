import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
       Scanner sc = new Scanner(System.in);
       double r = sc.nextDouble();
       double x,y,z;
       x=Math.PI;
       y=2*r*x;
       z=r*r*x;
       System.out.printf("%f ",z);
       System.out.printf("%f\n",y);
	}

}