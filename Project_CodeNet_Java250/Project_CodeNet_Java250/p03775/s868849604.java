import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int sum=0;
        Long a = stdIn.nextLong();
        int valLen = String.valueOf( a ).length();
        int max;
        for(long i=1; i*i<=a; i++){
            if(a % i == 0){
                long b = a/i;
                if(b>i){
                    max = String.valueOf( b ).length();

                }else{

                    max = String.valueOf( i ).length();
                }
                if(max<valLen){
                    valLen = max;
                }


            }
        }
        System.out.println(valLen);

    }
    }