import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        // Alice,Bob got poit.
        int a = 0;
        int b = 0;
        boolean isAlice = true;
        Integer val = null;
        while ((val = list.pollLast()) != null) {
            if (isAlice) {
                a += val;
            } else {
                b += val;
            }
            isAlice = !isAlice;
        }
        // 出力
        System.out.println(a-b);
    }
}
