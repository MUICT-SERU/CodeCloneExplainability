import java.util.*;

public class Main {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] time = new int[4];
        for(int i = 0; i < 4; i++) {
            time[i] = sc.nextInt();
        }
        
        if ((time[1] <= time[2]) || (time[3] <= time[0])) {
            System.out.println(0);
        } else if (time[0] <= time[2]) {
            if (time[3] <= time[1]) {
                System.out.println(time[3] - time[2]);
            } else {
                System.out.println(time[1] - time[2]);
            }
        } else if (time[0] > time[2]) {
            if (time[3] <= time[1]) {
                System.out.println(time[3] - time[0]);
            } else {
                System.out.println(time[1] - time[0]);
            }
        }
    }
}