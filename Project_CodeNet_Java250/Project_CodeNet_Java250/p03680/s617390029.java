import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s=1;
        int p=0;
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <a.length ; i++) {
            a[i]=scan.nextInt();
        }
        while (s!=2){
            s=a[s-1];
            p++;

            if (p>=a.length){
                p=-1;
                break;
            }
        }
        System.out.println(p);
    }
}
