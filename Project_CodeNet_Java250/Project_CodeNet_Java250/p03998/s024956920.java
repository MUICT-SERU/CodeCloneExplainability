import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = 1;
    char turn = 'a';
    int cnt1 = 0;
    int cnt2 = 0;
    int cnt3 = 0;
    String SA = sc.next();
    String SB = sc.next();
    String SC = sc.next();
    for(;;){
      if(turn=='a'){
        if(cnt1==SA.length()){
          System.out.println('A');
          return;
        }
        turn = SA.charAt(cnt1);
        cnt1++;
      }else if(turn =='b'){
        if(cnt2==SB.length()){
          System.out.println('B');
          return;
        }
        turn = SB.charAt(cnt2);
        cnt2++;
      }else if(turn =='c'){
        if(cnt3==SC.length()){
          System.out.println('C');
          return;
        }
        turn = SC.charAt(cnt3);
        cnt3++;
      }
    }
  }
}