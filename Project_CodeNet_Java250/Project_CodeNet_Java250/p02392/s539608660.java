import java.io.*;
import java.util.*;

class Main
{
    public static void main (String args[]) throws IOException         //?????????
    {
        InputStreamReader is = new InputStreamReader(System.in);       //?????????
        BufferedReader br = new BufferedReader(is);                    //?????????
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a < b) && (b < c)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
    