import java.util.Scanner;



public class Main{

  public static double Ca (double a,int n){
    double aa=1;
    for(int i=0;i<n;i++){
      aa*=a;
    }
    return aa;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int k=scanner.nextInt();
    int num=0;
    double ans=0;
    int flg=0;

    //double nn=1/(double)n;

    for(int i=1;i<=n;i++){
      flg=0;
      double nn=1/(double)n;
        num=i;
        while(num<k){
          flg++;
          num*=2;
        }
        for(int j=0;j<flg;j++){
          nn*=0.5;
        }
        ans+=nn;
        //System.out.println(ans);
    }
    System.out.printf("%.12f\n",ans);
  }
}
