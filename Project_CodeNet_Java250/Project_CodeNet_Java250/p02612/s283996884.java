import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.*;
public class Main
{   
static class FastReader 	
{		
BufferedReader br; 		
StringTokenizer st; 		
public FastReader() 		
{ 			
br = new BufferedReader(new	InputStreamReader(System.in)); 		
} 		
String next() 		
{ 			
while (st == null || !st.hasMoreElements()) 			
{ 				
try				
{ 					
st = new StringTokenizer(br.readLine()); 				
} 				
catch (IOException e) 				
{ 					
e.printStackTrace(); 				
} 			
} 			
return st.nextToken(); 		
} 
		
int nextInt() 		
{ 			
return Integer.parseInt(next()); 		
} 
		
long nextLong() 		
{ 			
return Long.parseLong(next()); 		
} 
		
double nextDouble() 		
{ 			
return Double.parseDouble(next()); 		
		 } 
		
		String nextLine() 		
		 { 			
String str = ""; 			
			 try			
			{ 				
				 str = br.readLine(); 			
			 } 			
			 catch (IOException e) 			
			 { 				
				 e.printStackTrace(); 			
			 } 			
			 return str; 		
		 } 	
	 }
	
	 public static void main(String[] args){
		 FastReader scan=new FastReader();
		 int t = scan.nextInt();
		 if(t%1000 == 0)System.out.println(0);
		 else System.out.println(1000 - t%1000);
	} 
} 
