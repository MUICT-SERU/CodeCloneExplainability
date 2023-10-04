import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();

        String a=scan.next();
        String b=scan.next();
        String c=scan.next();

        int []anum=new int [a.length()];
        int []bnum=new int[b.length()];
        int []cnum=new int[c.length()];


        anum=strToint(a);
        bnum=strToint(b);
        cnum=strToint(c);
        int []cnt=new int[3];
        String ans;
        int tmp=0;
        while(true){
            if(tmp==0){
                if(cnt[0]>=a.length()){
                    ans="A";
                    break;
                }
                tmp=anum[cnt[0]];
                cnt[0]++;
            }
            else if(tmp==1){
                if(cnt[1]>=b.length()){
                    ans="B";
                    break;
                }
                tmp=bnum[cnt[1]];
                cnt[1]++;
            }
            else if(tmp==2){
                if(cnt[2]>=c.length()){
                    ans="C";
                    break;
                }
                tmp=cnum[cnt[2]];
                cnt[2]++;
            }


        }
        System.out.println(ans);
        //System.out.println(cnt[0]+" "+cnt[1]+" "+cnt[2]);


    }
     static int[] strToint(String  a){

        int []ans=new int[a.length()];
        for(int i=0;i<a.length();i++){
            ans[i]=a.charAt(i)-'a';
        }
        return ans;
    }
}
