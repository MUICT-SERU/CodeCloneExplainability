import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()) {
	        //??\???1
	        String num1 = scan.next();
		 	long int1 = Long.parseLong(num1);
		 	//??\???2
		    String num2 = scan.next();
		    long int2 = Long.parseLong(num2);

		      /*??? ?????????????????????????????? ???
		   ????????¢?????´???????????????2???????????¶??°???????±???¨??????????????§?????????????????? a, b ??¨?????????( a >= b > 0 )???
		   (1) a ??? b ??§???????????????????????? r ?????\????????????
		   (2) r ??? 0 ?????? b ????????§??¬?´???°??§?????????????????????????????????
		   (3) ????????§????????¨????????°a = b?????°b = r ??¨?????? (1) ???????????????????????????
		     */
		    long a;
		    long b;
		    long r;
		    long lcm;
		    //a?????????
		    if(int1 > int2){
		    	a = int1;
		    	b = int2;
		    }else{
		    	b = int1;
		    	a = int2;
		    }
		    while(true){
		    	r = a%b;
		    	if(r==0){
		    		break;
		    	}
		    	a = b;
		    	b = r;
		    }

		    //LCM = A*B???GCD
		    lcm = int1 * int2 / b;
		    System.out.println(b+ " " + lcm);
	       }

		    scan.close();

	}
}