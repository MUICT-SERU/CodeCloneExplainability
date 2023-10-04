import java.util.*;
import java.io.*;
public class Main {
///////----------------input----------------//////
	static BufferedReader br= new BufferedReader(new
            InputStreamReader(System.in)); 
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st; 
	static byte[] buffer =new byte[10*1024];
	static int index;
    static InputStream input_stream= System.in;
    static int total;
	
	static String ns() throws IOException
    { 
		 StringBuilder sb = new StringBuilder();
         int n = read();
         while (isWhiteSpace(n))
             n = read();
         while (!isWhiteSpace(n)) {
             sb.append((char)n);
             n = read();
         }
         return sb.toString();
    } 
	
	static int read() throws IOException
	{
		if(total<0)
            throw new InputMismatchException();
        if(index>=total) {
            index=0;
            total= input_stream.read(buffer);
            if(total<=0)
                return -1;
        }
        return buffer[index++];
	}
	static int ni() throws IOException
    { 
		int integer=0;
        int n= read();
        while(isWhiteSpace(n))
            n= read();
        int neg=1;
        if(n=='-') {
            neg=-1;
            n= read();
        }
        while(!isWhiteSpace(n)) {
            if(n>='0'&&n<='9') {
                integer*=10;
                integer+=n-'0';
                n= read();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    } 

	static long nl() throws IOException
    { 
		long number=0;
        int n= read();
        while(isWhiteSpace(n))
            n= read();
        long neg=1l;
        if(n=='-') {
            neg=-1l;
            n= read();
        }
        while(!isWhiteSpace(n)) {
            if(n>='0'&&n<='9') {
                number*=10l;
                number+=(long)(n-'0');
                n= read();
            }
            else throw new InputMismatchException();
        }
        return neg*number;
    } 

	static double nd() throws IOException
    { 
		double doub=0;
        int n= read();
        while(isWhiteSpace(n))
            n= read();
        int neg=1;
        if(n=='-') {
            neg=-1;
            n= read();
        }
        while(!isWhiteSpace(n)&&n!='.') {
            if(n>='0'&&n<='9') {
                doub*=10;
                doub+=n-'0';
                n= read();
            }
            else throw new InputMismatchException();
        }

        if(n=='.') {
            n= read();
            double temp=1;
            while(!isWhiteSpace(n)) {
                if(n>='0'&&n<='9') {
                    temp/=10;
                    doub+=(n-'0')*temp;
                    n= read();
                }
                else throw new InputMismatchException();
            }
        }
        return doub*neg;
    } 

	static String nsl() throws IOException
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
	static boolean isWhiteSpace(int n) {
        if(n==' '|| n=='\n'|| n=='\r'|| n=='\t'|| n==-1)
            return true;
        return false;
    }
	
	///////-------------output-----------------//////
	static public void p(String str) throws IOException {
        bw.append(str);
    }
	static public void pn(String str) throws IOException {
        p(str);
        bw.append("\n");
    }
	static public void close()throws IOException {
        bw.close();
    }
	static public void flush()throws IOException {
        bw.flush();
    }
	
	///////----------THE FAST I/O METHODS ENDS HERE -----------/////////////
	static class Node{
		int h;
		int w;
		Node(int h,int w)
		{
			this.h=h;
			this.w=w;
		}
	}
	
	static boolean al[]=new boolean[1100000];
	  public static void prime()
	  {
	    int n=1000000;
	   
	    for(int i=2;i*i<=n;i++)
	    {
	      if(!al[i]){
	      for(int j=i*2;j<=n;j+=i)
	      {
	        al[j]=true;
	      }
	        
	      }
	    }
	  }
	  public static void main(String args[]) throws IOException {
	    
	    //write your code here
	    
	 String str=ns();
	 if(str.charAt(0)=='R')
	 {
		 if(str.charAt(1)=='R')
		 {
			 if(str.charAt(2)=='R')
				 pn("3");
			 else if(str.charAt(2)=='S')
				 pn("2");
		 }
		 if(str.charAt(1)=='S')
		 {
			 if(str.charAt(2)=='R')
				 pn("1");
			 else if(str.charAt(2)=='S')
				 pn("1");
		 }
	 }
	 if(str.charAt(0)=='S')
	 {
		 if(str.charAt(1)=='R')
		 {
			 if(str.charAt(2)=='R')
				 pn("2");
			 else if(str.charAt(2)=='S')
				 pn("1");
		 }
		 if(str.charAt(1)=='S')
		 {
			 if(str.charAt(2)=='R')
				 pn("1");
			 else if(str.charAt(2)=='S')
				 pn("0");
		 }
	 }
	  flush();
	   
	  
	    
	  }
}