import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();
		
		s = br.readLine();
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(Character.isLetter(c)){
				if(Character.isUpperCase(c)){
					sb.append(Character.toLowerCase(c));
				}else{
					sb.append(Character.toUpperCase(c));
				}
			}else{
				sb.append(c);
			}	
		}
		
		System.out.println(sb);
		
	}
}