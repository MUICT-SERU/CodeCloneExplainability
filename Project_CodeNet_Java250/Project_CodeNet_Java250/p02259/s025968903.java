import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int m,i,j,big,k;
		int count = 0;
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int array[] = new int[n];

		for(m=0;m<n;m++)array[m] = Integer.parseInt(in.next());

	for (i=0; i<n-1; i++){               //???????????????????????????????????°i
		for (j=n-1; j>=i+1; j--){        //?????????????°?????????£??\????´???¨??????????????????????????°j
			if (array[j] < array[j-1]){
				big = array[j-1];        //??§???????????????????´????????????????????????????????????°big
				array[j-1] = array[j];   //??????????????§??\???????????????
				array[j] = big;
				count++;                 //???????????\??????????????°?????????????????????
			}
		}
	}
	for(k = 0;k<n-1;k++){
		System.out.print(array[k]+" ");
	}
    if(k==(n-1))System.out.println(array[k]);
			System.out.println(count);
	}
}