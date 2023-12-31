import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for(int i = 0; i < w.length(); i++) {
      String s = String.valueOf(w.charAt(i));
      if(map.containsKey(s)) {
        map.put(s, map.get(s) + 1);
      } else {
        map.put(s, 1);
      }
    }
    String ans = "Yes";
    for(String str : map.keySet()) {
      if(map.get(str) % 2 == 1) ans = "No";
    }
    System.out.println(ans);
  }
}
