import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		        	     //???????????\??????????????¨
		        	   String strings = input.readLine();

		        	   //?????????????????????????´????
			           String strings_words = strings;

			           //String??????strings_words???toCharArray()??§char????????????
			           char[] c=strings_words.toCharArray();

			           //
			           for(char cl: c){

			        	   //cl???String??????????????¨
			        	   String str__conversion= String.valueOf(cl);

			        	   String output="";

			        	   //cl?????????????????§??????????¢????
			        	   if(Character.isUpperCase(cl)){

			        		   //?°??????????
			        		   output=  str__conversion.toLowerCase();

			        		   //?°?????????????
			        	   }else{

			        		    output= str__conversion.toUpperCase();

			        	   }

			        	   System.out.print(output);

			           }
  System.out.println("");


	}

}