import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(), s = in.nextInt();
        int res = 0;
        for (int i = 0; i <= k; ++i) {
            for (int j = 0; j <= k; ++j) {
                int dif = s - i - j;
                if (dif >= 0 && dif <= k) {
                    ++res;
                }
            }
        }
        System.out.println(res);
    }
}

