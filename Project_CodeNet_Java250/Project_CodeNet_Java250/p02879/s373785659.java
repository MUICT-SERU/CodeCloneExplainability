import java.util.*;
 
public class Main{
	public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      int b = input.nextInt();
       if(a>9 || b>9){
         	System.out.println(-1);
       } 
      	else{
          System.out.println(a*b);
        }  
    }
} 