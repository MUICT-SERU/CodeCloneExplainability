import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    
    int cnt = 0;
    
    for(int i=0;i<str.length();i++) {
      if(str.substring(i, i+1).equals("1")) {
        cnt += 1;
      }
    }
    System.out.println(cnt);
  }
}