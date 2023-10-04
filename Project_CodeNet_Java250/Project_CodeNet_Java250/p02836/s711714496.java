import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] t = readLine();
		char[] s = t[0].toCharArray();
		int cnt = 0;
		for(int i=0;i<s.length/2;i++) {
			if(s[i]!=s[s.length-1-i]) {cnt++;}
		}
		
		//String[] s = readLine();
		print(cnt);
	}
	
	//functions here
	//note that all methods should be STATIC
	private static double getDistance(int[] p1,int[] p2) {
		double s = 0;
		for(int i=0;i<p1.length;i++) {
			s+=(p1[i]-p2[i])*(p1[i]-p2[i]);
		}
		return Math.sqrt(s);
	}
	
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}