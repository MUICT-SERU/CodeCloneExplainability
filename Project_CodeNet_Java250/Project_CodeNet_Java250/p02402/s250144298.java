//API???????????????
import java.util.Scanner;
class Main{
      	public static void main(String[] args){
	//???????????\???
    	Scanner scan = new Scanner(System.in);
    	//???????????´??°?????????????????£??\
    	int n = scan.nextInt();
    	int a;
    	int min = 0;
    	int max = 0;
	//?????????long????????????????????£??\
    	long sum = 0;
    	
	//n??????????????????????????§??°?????????
    	for(int i = 0; i < n; i++){
    	    a = scan.nextInt();
    	    if(i == 0) {
    	    	min = a;
    	    	max = a;
    	    }
	    if(min > a){
		min = a;
	    }
    	    //min = Math.min(min, a);
	
	    if(max < a){
		max = a;
	    }
    	    //max = Math.max(max, a);
    	    sum += a;
    	}
    	//????????????
    	System.out.println(min + " " + max + " " + sum);
    	
     }
}