import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s= sc.next();
		String buff= "";
		//double n = sc.nextInt()/1000.0;
		int m = sc.nextInt();
		int k = sc.nextInt();
		//String s=sc.next();
		long count=1,flag=0;
		long count1=0,count2=0;
		int count3=9999999;
		int[] array1 = new int[m];
		int[] array2 = new int[m];
		int[] array3 = new int[m-1];
		/*array[0]=n-m;
		array[1]=n*m;
		array[2]=n+m;*/
		//Arrays.sort(array);

		for(int i=0;i<1000;i++) {
			if(k==1) {
				count=0;
				break;
			}
			if(m>=k) {
				count=1;
				break;
			}
			if(count>=k) {
				count=i;
				break;
			}
			count+=m-1;
			//System.out.println(count+" "+i);
		}

		/*if(count==0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}*/

		System.out.println(count);
	}
}


