import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
      
    for(int i=1;i<10001;i++){
      if(Math.floor(i*0.1)==b){
        if(Math.floor(i*0.08)==a){
          System.out.println(i);
          return;
        }
      }
    }
    System.out.println(-1);
  }
}