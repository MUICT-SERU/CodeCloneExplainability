import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        
        for(int i = 0;i < 3;i++) {
            for(int j = 0;j < 3;j++) c[i][j] = sc.nextInt();
        }
        
        boolean isOK = true;
        isOK &= (c[0][0] - c[0][1]) == (c[1][0] - c[1][1]);
        isOK &= (c[0][0] - c[0][1]) == (c[2][0] - c[2][1]);
        isOK &= (c[1][0] - c[1][1]) == (c[2][0] - c[2][1]);
        isOK &= (c[0][0] - c[0][2]) == (c[1][0] - c[1][2]);
        isOK &= (c[0][0] - c[0][2]) == (c[2][0] - c[2][2]);
        isOK &= (c[1][0] - c[1][2]) == (c[2][0] - c[2][2]);
        isOK &= (c[0][1] - c[0][2]) == (c[1][1] - c[1][2]);
        isOK &= (c[0][1] - c[0][2]) == (c[2][1] - c[2][2]);
        isOK &= (c[1][1] - c[1][2]) == (c[2][1] - c[2][2]);

        String ans = isOK ? "Yes" : "No";
        System.out.println(ans);
    }
}
