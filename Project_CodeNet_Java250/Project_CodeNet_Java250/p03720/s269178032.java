import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int count = 0;
    ArrayList<Integer> array = new ArrayList<Integer>();
    for(int a=0;a<M*2;a++){
      array.add(sc.nextInt());
    }
    for(int b=1;b<=N;b++){
      count = 0;
      for(int c=0;c<M*2;c++){
        if(array.get(c)==b){
          count += 1;
        }
      }
      System.out.println(count);
    }
  }
}