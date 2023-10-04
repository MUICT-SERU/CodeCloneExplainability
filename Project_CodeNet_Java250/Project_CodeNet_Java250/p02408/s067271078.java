import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created 2017/06/11.
 */
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    
    //?????¶????????¨??????????????????
    LinkedHashMap<String,LinkedHashSet<Integer>> dr = new LinkedHashMap<>();
    String s = "S";
    String h = "H";
    String c = "C";
    String d = "D";
    
    dr.put(s,rankmake());
    dr.put(h,rankmake());
    dr.put(c,rankmake());
    dr.put(d,rankmake());
    
    //System.out.println(dr); 
    //??\????????\?????¨????????????

    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      String d_input = sc.next();
      int r_input = sc.nextInt();
      dr.get(d_input).remove(r_input);
    }
    //??¨?????????????????????
    //System.out.println(dr); //????????????
    
    //?????????????????¨??????hashset??????????¨??????????????????????for?????§??¨??¨??¨????????????????????§
    for(String key : dr.keySet()){
      LinkedHashSet<Integer> r_end =dr.get(key);
      for(int i : r_end){
        System.out.println(key + " " + i);
      }
    }

  }
  public static LinkedHashSet<Integer> rankmake() {
    LinkedHashSet<Integer> rank = new LinkedHashSet<>();
    for(int i = 1;i <=13;i++){
      rank.add(i);
    }
    return rank;
  }
}