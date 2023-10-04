import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 宝石の数N個
        Integer n = Integer.valueOf(sc.nextLine());

        // 宝石の価値
        String vStr = sc.nextLine();
        Map<Integer, Integer> vList = str2List(vStr);

        // 宝石のコスト
        String cStr = sc.nextLine();
        Map<Integer, Integer> cList = str2List(cStr);
        
        Integer max = 0;
        for (Integer i = 0; i < n; i++) {
            Integer profit = vList.get(i) - cList.get(i);
            if (profit > 0) {
                max += profit;
            }
        }

        System.out.println(max);
    }

    static Map<Integer, Integer> str2List(String str) {
        String[] vArrStr = str.split(" ");

        Map<Integer, Integer> ret = new HashMap<>();
        Integer key = 0;
        for (String val:vArrStr) {
            ret.put(key, Integer.valueOf(val));
            key++;
        }

        return ret;
    }
}
