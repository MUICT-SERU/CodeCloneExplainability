import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("\\s");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a < b ){
       if(b < c){
       System.out.println("Yes");
       }else{
       System.out.println("No");
       }
    }else {
       System.out.println("No");
    }  

       
   
  }

}