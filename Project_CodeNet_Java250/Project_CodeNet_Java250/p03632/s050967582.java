import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(),
            c = in.nextInt(), d = in.nextInt();
        
        if((c > b && d > b) || (a > d && b > d)){
            System.out.println(0);
            return;
        }
        int ans = 0;
        if(a > c){
            ans = d - a - Math.max(0, d - b);
        }else{
            ans = b - c - Math.max(0, b - d);
        }
        System.out.println(ans);
    }
}