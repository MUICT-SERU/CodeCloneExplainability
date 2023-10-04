
import java.util.*;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();

        }

        int currentIndex = 0;
        int goalIndex = 1;
        int tryCount = n;

        while (currentIndex != goalIndex && tryCount > 0){
            int index = a[currentIndex];
            currentIndex = index-1;
            --tryCount;
        }

        if(currentIndex == goalIndex){
            System.out.print(n- tryCount);
            return;
        }

        System.out.print(-1);
    }
}