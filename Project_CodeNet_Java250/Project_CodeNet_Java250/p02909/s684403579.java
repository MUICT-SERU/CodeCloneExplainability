import java.io.*;
import java.util.*;
import java.util.Arrays;

class Main {

    // Generated by 1.1.5 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();
        solve(S);
    }

    static void solve(String S){
        String[] arr = {"Sunny", "Cloudy", "Rainy"};
        int index = Arrays.asList(arr).indexOf(S);
        if (index == 2) {
            index = 0;
        } else {
            index++;
        }
        System.out.println(arr[index]);

    }
}