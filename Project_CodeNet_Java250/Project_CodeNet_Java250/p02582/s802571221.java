import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   String s=kbd.next();
   int cou=0;
   if(s.contains("RRR")){
    System.out.println(3);
 }else if(s.contains("RR")){
   System.out.println(2);
 }else if(s.contains("R")){
   System.out.println(1);
}else{
  System.out.println(0);
}
}}
