import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i][0] == arr[i][1]){
                count++;
            } else {
               count = 0;
            }
            if(count == 3){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}
