import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int w,n,x,y;
        w=sc.nextInt();
        n=sc.nextInt();
        int[] values=new int[w];
        int i;
        for(i=0;i<values.length;i++){
            values[i]=i+1;
        }
        for(i=0;i<n;i++){
            String str = sc.next();
             String[] ab = str.split(",");
              int a = Integer.parseInt(ab[0]) - 1;
              int b = Integer.parseInt(ab[1]) - 1;
              int tmp;
              tmp=values[a];
              values[a]=values[b];
              values[b]=tmp;
        }
        int j;
        for(j=0;j<w;j++){
            System.out.println(values[j]);
        }
    }
}
