import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    final int al = a.length();
    final int bl = b.length();
    final int cl = c.length();
    int aa = al;
    int bb = bl;
    int cc = cl;
    char judge = a.charAt(al - aa);
    aa = aa - 1;
    while(true){
      if(judge == 'a'){
        if(aa == 0){break;}else{
        judge = a.charAt(al - aa);
        aa = aa -1;
        }
      }else if (judge == 'b') {
        if(bb == 0){break;}else{
        judge = b.charAt(bl - bb);
        bb = bb -1;
        }
      }else if(judge == 'c'){
        if(cc == 0){break;}else{
        judge = c.charAt(cl - cc);
        cc = cc -1;
        }
      }
    }
    if(judge == 'a'){System.out.println("A");}else if(judge == 'b'){System.out.println("B");}else{System.out.println("C");}
  }
}
