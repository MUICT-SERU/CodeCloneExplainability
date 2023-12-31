import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] floor = new int[13][11];
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            int block = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);
            int x = Integer.parseInt(st[2]);
            int value = Integer.parseInt(st[3]);
            floor[(3 * (block - 1)) + y][x] += value;
        }

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 11; j++) {
                bw.append(" " + floor[i][j]);
            }
            bw.newLine();
            if (i % 3 == 0 && i < 12) {
                bw.append("####################\n");
            }
        }

        bw.flush();
    }

}

