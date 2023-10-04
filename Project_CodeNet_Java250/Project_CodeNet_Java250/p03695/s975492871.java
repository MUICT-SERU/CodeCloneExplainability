import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> points = new ArrayList<>();
        for(int i=0; i<n; i++) {
            points.add(sc.nextInt());
        }

        int range[] = {0,0,0,0,0,0,0,0,0};

        for(int p: points) {
            if (p < 400) range[0]++;
            else if (p < 800) range[1]++;
            else if (p < 1200) range[2]++;
            else if (p < 1600) range[3]++;
            else if (p < 2000) range[4]++;
            else if (p < 2400) range[5]++;
            else if (p < 2800) range[6]++;
            else if (p < 3200) range[7]++;
            else range[8]++;
        }

        int count = 0;
        int max = 0;

        for(int i=0; i<8; i++) {
            if (range[i] > 0) count++;
        }
        if(count == 0) {
            count = 1;
            max = range[8];
        } else {
            max = count + range[8];
        }
        System.out.println(count + " " + max);
    }
}