import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	int a,b;
	String s = buf.readLine();
	String[] strlAry =s.split(" ");
	for(int i=0;i<strlAry.length;i++){
	}	
	a= Integer.parseInt(strlAry[0]);
	b= Integer.parseInt(strlAry[1]);
	if(a>b){
		System.out.println("a > b");
	}
	else if(a<b){
		System.out.println("a < b");	
	}
	else{
		System.out.println("a == b");
	}
}
}