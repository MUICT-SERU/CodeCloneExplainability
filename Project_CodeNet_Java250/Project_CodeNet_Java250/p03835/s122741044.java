import java.util.Scanner;

class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int K = in.nextInt(), S = in.nextInt();
        int sum = 0;
        for(int i = 0; i <= K; i++){
            for(int j = 0; j <= K; j++){
                if(i + j >= S - K && i + j <= S){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }

}