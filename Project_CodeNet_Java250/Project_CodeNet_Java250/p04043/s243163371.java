import java.util.*;
public class Main {
    
public static void main (String[]args){
  Scanner input = new Scanner (System.in);
  int a = input.nextInt();
  int b = input.nextInt();
  int c = input.nextInt();
  int count5=0;
  int count7=0;
  if (a==5){     
      count5++;
  }
  else if (a==7){
      count7++;
  }
  if (b==5){     
      count5++;
  }
  else if (b==7){
      count7++;
  }
  if (c==5){     
      count5++;
  }
  else if (c==7){
      count7++;
  }
  if (count5==2 && count7==1){
      System.out.println("YES");
  }
  else{
      System.out.println("NO");
  }

}
}