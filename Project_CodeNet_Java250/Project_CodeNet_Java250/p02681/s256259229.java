import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] S = sc.next().split("");
    String[] T = sc.next().split("");
    String ret = "Yes";
    for (int i = 0; i < S.length; i++) {
      if (!S[i].equals(T[i])) {
        ret = "No";
        break;
      }
    }
    System.out.println(ret);
  }
}
