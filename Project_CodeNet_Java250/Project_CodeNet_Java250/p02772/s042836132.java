import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a =new int[n];
        int no=0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i]%2==0){
                if(a[i]%3 ==0 ||a[i]%5 ==0){
                    
                }else{
                    no++;
                }
            }
        }
        if(no>0){
            System.out.println("DENIED");
        }else{
            System.out.println("APPROVED");
        }
    }
}