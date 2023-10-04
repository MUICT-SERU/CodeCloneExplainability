import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, Integer> cache = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!cache.containsKey(c)) {
                cache.put(c, 1);
            }
            else {
                cache.put(c, cache.get(c) + 1);
            }
        }

        boolean beautiful = true;
        for (int count : cache.values()) {
            if (count % 2 != 0) {
                beautiful = false;
                break;
            }
        }
        System.out.println(beautiful ? "Yes" : "No");
    }
}
