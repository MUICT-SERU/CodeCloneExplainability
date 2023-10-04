import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        int N = input.nextInt();
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++){
            a[i] = input.nextInt();
        }
        Arrays.sort(a,Comparator.reverseOrder());
        int A = 0;
        int B = 0;
        for (int i = 0; i < N; i++){
            if (i%2 == 0){
                A += a[i];
            }
            else{
                B += a[i];
            }
        }
        System.out.println(A-B);
    }
}