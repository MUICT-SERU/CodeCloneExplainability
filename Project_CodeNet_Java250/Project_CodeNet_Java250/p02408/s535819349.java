import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try{
        //??¨?????????????????\???????????????????????????????????????????´?????????????

                  //??\????????????????????????????????¨???????????????????????????
        	int Array_input[][]=new int[4][14];
        	     String az=input.readLine();
        	     int a=Integer.parseInt(az);
                 //egara_num?????????????????¨??????
        	     int egara_num=0;
        	     int c=0;
                 //??\????????????a????????°???.?????????Array_input???????´??????\??????
                 for(int s=0;s<a;s++){
			        String ab = input.readLine();
		            String []strAry = ab.split(" ");
		            String b=strAry[0];
                 //?????????????????????????????\??????????????¨??????????????????
		            if(b.equals("S")){
		        	   egara_num=0;
		            }else if(b.equals("H")){
		        	    egara_num=1;
		            }else if(b.equals("C")){
		        	    egara_num=2;
		            }else if(b.equals("D")){
		        	    egara_num=3;
		            }
		             c=Integer.parseInt(strAry[1]);
		             //?????????????????§?????????????´?
                Array_input[egara_num][c]=(egara_num*100)+c;

                //System.out.println(Array_input[egara_num][c]);
                 }

                 int Array[][]=new int[4][14];
                 for(int i=0; i<4; i++){
                     for(int j=1; j<14; j++){
                      		Array[i][j]=(i*100)+j;
                      		//??????Array???????´??????????Array_input???????´?????????????
                      if(Array[i][j]!=(Array_input[i][j])){
                    	 int num=Array[i][j];
                    	if(num<100){
                    		System.out.println("S"+" "+j);
                    	 }else if(num>100&&num<200){
                    		 System.out.println("H"+" "+j);
                    	 }else if(num>200&&num<300){
                    		 System.out.println("C"+" "+j);
                    	 }else{
                    		 System.out.println("D"+" "+j);
                    	 }

                        }

                      }

                     }


		      }catch(IOException e) {   System.out.println("Exception : " + e);
		    }

	//60

	}
}