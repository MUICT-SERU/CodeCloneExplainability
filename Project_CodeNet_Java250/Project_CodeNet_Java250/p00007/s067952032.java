class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int n = sc.nextInt();
		
		double money = 100000;
		
		for( int i = 0 ; i < n ; i++ ){
			money *= ( 1.05 );
			money += 999;
			money =  (int)(money/1000)*1000;
		}
		System.out.println( (int)money );
	}
}