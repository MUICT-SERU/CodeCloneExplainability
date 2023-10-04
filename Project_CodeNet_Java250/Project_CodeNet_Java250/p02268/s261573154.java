import java.util.*;

class Main {
	//????????¢?´¢?????¬???
	public static int binarySearch(int[] A, int n, int key) {
		int left = 0;
		int right = n ;
		int mid = 0;
		while(left < right) {
			 mid = (left + right) / 2;
			if ( key == A[mid] ) return mid;
			else if ( key > A[mid] ) left = mid + 1;
			else if ( key < A[mid] ) right = mid;
		}
	return -1;
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int[] arrayS = new int[100000]; //??°???S
		int[] arrayT = new int[50000];   //??°???T
		int count = 0;						 //?????°????¨???????????????°

		//????´??????°???????????????ArrayS?????°???S???????????????
		int sNum = scan.nextInt();
		for (int i = 0; i < sNum; i++)
			arrayS[i] = scan.nextInt();

		//????´??????°???????????????ArrayT?????°???T???????????????
		int tNum = scan.nextInt();
		for (int j = 0; j < tNum; j++)
			arrayT[j] = scan.nextInt();

		//??°???T???????´??????°???A????????????????????????????????????
		for (int j = 0; j < tNum; j++)
			if(binarySearch(arrayS, sNum, arrayT[j]) >= 0) count++;

		System.out.println(count);
	}
}