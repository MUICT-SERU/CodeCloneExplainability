import java.util.Arrays;
import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    int[][][] data=new int[5][4][11];
     
     
    public void run() {
        int N = sc.nextInt();
        for(int i=0;i<data.length;i++)for(int j=0;j<data[i].length;j++)Arrays.fill(data[i][j],0);
        for(int i=0;i<N;i++){
            int b=sc.nextInt(),f=sc.nextInt(),r=sc.nextInt(),v=sc.nextInt();
                data[b][f][r]+=v;
        }
         
        for(int b=1;b<=4;b++){
            for(int f=1;f<=3;f++){
                for(int r=1;r<=10;r++){
                    pr(" "+data[b][f][r]);
                }
                ln();
            }
            if(b!=4)ln("####################");
        }
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    public static void pr(Object o) {
        System.out.print(o);
    }
 
    public static void ln(Object o) {
        System.out.println(o);
    }
 
    public static void ln() {
        System.out.println();
    }
}
