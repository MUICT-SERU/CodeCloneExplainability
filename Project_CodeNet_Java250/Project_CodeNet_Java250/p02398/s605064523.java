public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int count = 0;
		for ( int div = a; div <= b; div++) {
			if ( c % div == 0 )
				count++;
		}

		System.out.println(count);
	}

}