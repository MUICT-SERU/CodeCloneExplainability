import java.util.Scanner;

public class Main{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 while(true){
 int n= sc.nextInt();
 if(n==0){break;}
 int[] scores=new int[n];
 double average=0, variance=0;
 for(int i=0; i<scores.length; i++){
 scores[i] =sc.nextInt();
 average += scores[i];
 }
 average /= n;
 for(int i=0; i<scores.length;i++){
 variance += (scores[i]-average)*(scores[i]-average);
 }
 variance /= n;
System.out.println(Math.sqrt(variance));
  }
 }
}