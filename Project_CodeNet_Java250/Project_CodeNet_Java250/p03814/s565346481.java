import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
 		BufferedReader br = new BufferedReader(
 			new InputStreamReader(System.in));
 		String s = br.readLine();
 		int idxA =0;
 		for(int i=0; i<s.length(); i++){
 			if(s.charAt(i)=='A'){
 				idxA = i;
 				break;
 			}
 		}
 		int idxZ = s.length()-1;
 		for(int j = s.length()-1; j>=0; j--){
 			if(s.charAt(j) =='Z'){
 				idxZ = j;
 				break;
 			}
 		}
 		System.out.println(idxZ - idxA + 1);
 	}
} 