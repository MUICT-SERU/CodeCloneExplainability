import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{
			  //??\???
			  String ab = input.readLine();
		      int a=Integer.parseInt(ab);
		      String an=input.readLine();
		      String[] strAry;
		      //????????????????´?????????????????´?
	          strAry=an.split(" ");
	          //??\??????????????°??????????????????????????§a????????§-1??????????????§??°?????????
	          //a???5?????¨???5.4.3.2.1??§0????????????????????¨???
	          for(int i=a-1; i>=0; i--){
	        	  //Array???????????????????????????????????????
	               int  b=Integer.parseInt(strAry[i]);
	                 //??\??????????????????i???????????°???????????????a?????°????????????
	               if(i>0){
	                    System.out.print(b+" ");
	               }else{
	            	   System.out.print(b);
	               }

	        	}
	          System.out.println("");






		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }

	}
}