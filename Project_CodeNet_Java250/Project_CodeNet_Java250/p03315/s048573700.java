import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String s =sc.next();
      	int t = 0;	
     	for(int i = 0; i < 4; i++){
        	if(s.charAt(i) == '+') t++;
          	else t--;
        }
      	System.out.println(t);
    }
}