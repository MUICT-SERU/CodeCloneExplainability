import java.util.Scanner;

class Main {
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();	
	int d, r;
	double f;

	d = a / b;
	r = a % b;
	f = 1.0 * a / b;
	
	System.out.print(d);
	System.out.print(' ');
	System.out.print(r);
	System.out.print(' ');
	System.out.print(String.format("%.5f", f));
    }
}
