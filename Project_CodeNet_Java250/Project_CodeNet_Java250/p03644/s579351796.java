import java.util.*;

class Main{

  static int answer(int n){
    int power = 1;
    for(int i=0;i<7;i++){
      if(power <= n && n < power*2){
        return power;
      }else{
        power = power*2;
      }
    }
    return 0;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(answer(n));
  }
}