import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }

        int bot=0;
        int cnt=1;
        while(true){
            if(a[bot]==2){
                break;
            }else{
                bot=a[bot]-1;
            }

            if(cnt>n){
                cnt=-1;
                break;
            }


            cnt++;
        }

        System.out.println(cnt);


    }
}