

import java.util.Scanner;

public class Main {
	public static void main(String []args){
		//????????£????????????
		Scanner sc = new Scanner(System.in);
		//??\???????????????????????£?????????
		String word =sc.nextLine();
		//
		StringBuilder out = new StringBuilder();
		//??£?¨?
		 String w;
		 //
		 for(int i =0; i<word.length();i++){
			 w= word.substring(i,i+1);
			//?????£?????\?????????????°???????????????§???????????????
			 if(w.equals(w.toLowerCase())){
				 w = w.toUpperCase();
			//?????£?????\??????????????§?????????????°????????????????
			}else if(w.equals(w.toUpperCase())){
				w = w.toLowerCase();
			}
			 System.out.append(w);
		 }

		 //??¨???
		 System.out.println(out);
	}
}