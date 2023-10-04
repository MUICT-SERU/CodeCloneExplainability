import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums;
        int h, w, i, j;
        while (true) {
            nums = br.readLine().split(" ");
            h = Integer.parseInt(nums[0]);
            w = Integer.parseInt(nums[1]);
            if (h == 0 && w == 0) break;
            for (i = 0; i < h; i++) {
                for (j = 0; j < w; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}