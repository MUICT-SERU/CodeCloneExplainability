import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();

        int[] cnt = new int[26];
        for(int i=0; i<w.length(); i++){
            int idx = (int)w.charAt(i) - (int)'a';
            cnt[idx] = cnt[idx] ^ 1;
        }

        int check=0;
        for(int i=0; i<26; i++){
            check += cnt[i];
        }

        if(check == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
