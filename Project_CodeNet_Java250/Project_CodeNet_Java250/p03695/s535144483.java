import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(reader.readLine());
        String[] inputs = reader.readLine().split(" ");
        boolean[] colors = new boolean[8];
        int above3200 = 0;
        for (int i = 0; i < N; i++) {
            int rate = Integer.parseInt(inputs[i]);
            if(rate <= 399) {
                colors[0] = true;
            } else if (rate <= 799) {
                colors[1] = true;
            } else if (rate <= 1199) {
                colors[2] = true;
            } else if (rate <= 1599) {
                colors[3] = true;
            } else if (rate <= 1999) {
                colors[4] = true;
            } else if (rate <= 2399) {
                colors[5] = true;
            } else if (rate <= 2799) {
                colors[6] = true;
            } else if (rate <= 3199) {
                colors[7] = true;
            } else {
                above3200 +=1;
            }
        }

        int count = 0;
        for (int i = 0; i < 8; i++) {
            if(colors[i]) {
                count += 1;
            }
        }
        int min = count;
        if(count == 0 && above3200 > 0) {
            min += 1;
        }
        int max = count + above3200;
        System.out.println(min + " " + max);
    }
}