import java.io.*;
import java.util.*;


public class Main{
	
	public static void main(String[] args){
	
	MyScanner sc = new MyScanner();
	out = new PrintWriter(new BufferedOutputStream(System.out));
	
	/**/

	int numberOfPersons = sc.nextInt();
	long[] persons = new long[numberOfPersons];
	long counter = 0;
	
	for(int i = 0; i < numberOfPersons; i++){
		
		persons[i] = sc.nextLong();
		
	}
	
	for(int i = 1; i < persons.length; i++){
		
		if(persons[i] < persons[i - 1]){
		
			counter += persons[i - 1] - persons[i];
			persons[i] = persons[i - 1];
		
		}
		
	}
	
	System.out.println(counter);
	
	
	
	/**/
	 
	 out.close();	
	}
	
	
	
	public static PrintWriter out;
	
	public static class MyScanner{
		
		BufferedReader br;
		StringTokenizer st;
		
		public MyScanner(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
 
      long nextLong() {
          return Long.parseLong(next());
      }
 
      double nextDouble() {
          return Double.parseDouble(next());
      }
 
      String nextLine(){
          String str = "";
	  try {
	     str = br.readLine();
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  return str;
      }

   }
	
}
