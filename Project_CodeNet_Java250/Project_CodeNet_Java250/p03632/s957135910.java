import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[4];

        for(int i = 0; i < 4; i++){
            num[i] = sc.nextInt();
        }

        if(num[0] <= num[2] && num[2] <= num[1] && num[1] <= num[3]){
            System.out.print(num[1] -num[2]);
        } else if(num[0] <= num[2] && num[2] <= num[3] && num[3] <= num[1]){
            System.out.print(num[3] - num[2]);
        } else if(num[2] <= num[0] && num[0] <= num[3] && num[3] <= num[1]){
            System.out.print(num[3] - num[0]);
        } else if(num[2] <= num[0] && num[0] <= num[1] && num[1] <= num[3]){
            System.out.print(num[1] - num[0]);
        } else{
            System.out.print(0);
        }
    }
}