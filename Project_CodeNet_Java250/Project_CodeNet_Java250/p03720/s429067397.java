public class Main{

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner (System.in);
		int N=scanner.nextInt() ;

		int M=scanner.nextInt() ;
		
		int a[]=new int[M+1];
		int b[]=new int[M+1];
		
		for(int i=1;i<=M;i++){
			a[i]=scanner.nextInt() ;

			b[i]=scanner.nextInt() ;
		}
		
		for(int i=1;i<=N;i++){
			int sum=0;
			for(int p=1;p<=M;p++){
				if(a[p]==i||b[p]==i){
					sum+=1;
				}
			}
			System.out.println(sum);
			
		}
		
	}

}