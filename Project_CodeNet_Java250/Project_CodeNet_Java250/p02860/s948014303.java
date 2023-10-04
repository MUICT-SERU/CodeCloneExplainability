import java.util.Scanner;

class Main {

  static boolean RS(String S, int n) {
    if (n%2 == 1)
      return false;
    for(int i = 0; i < n/2; i++)
      if(S.charAt(i) != S.charAt(i+n/2))
        return false;
    return true;
  }
  
  static void PutYN(boolean b) {
    if(b)
      System.out.println("Yes");
    else
      System.out.println("No");
      
  }
  
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    int n = stdIn.nextInt();
    String S = stdIn.next();
    
    PutYN(RS(S, n)); 
  }
}
