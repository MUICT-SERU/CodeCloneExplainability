import java.util.Scanner;

public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        for (int i=a; i<=b; i++ ){
            if(c%i==0) count++;
        }
        System.out.printf("%d\n", count);


    }

    public static void main(String[] args){
        new Main();
    }
}

