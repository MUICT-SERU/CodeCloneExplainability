import java.io.*;

public class Main{
    public static void main(String[]args) throws NumberFormatException, IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[]str= br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int i,mod=0,count=0;
        for(i=a;i<b+1;i++){
            mod=c%i;
            if(mod==0)count++;
        }
        System.out.println(count);
    }
}