import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] s = br.readLine().split(" ",0);
	int K = Integer.parseInt(s[0]);
	int S = Integer.parseInt(s[1]);
	int X,Y,Z;
	int count = 0;
	for(X = 0; X <= K; X++){
	    for(Y = 0; Y <= K; Y++){
		Z = S - X - Y;
		if(0 <= Z && Z  <= K){
		    count++;
		}
	    }
	}
	System.out.println(count);
    }
}
