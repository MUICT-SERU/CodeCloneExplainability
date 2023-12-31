import java.util.*;import java.io.*;import java.math.*;
public class Main{
	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(OBJECT_MEMORY);
		int index = 0; int max;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				String read;
				try{
					read = br.readLine();
				}catch(IOException e){
					read = null;
				}
				if(read != null){
					inputLine.add(read);
				}else{
					break;
				}
			}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				String returnStr = inputLine.get(index);
				index++;
				return returnStr;
			}else{
				throw new IndexOutOfBoundsException("There is no more input");
			}
		}
	}
	static final int OBJECT_MEMORY = 1024;
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
	static ArrayList<String> nextStrArray(){return myconv(next(), HAN);}
	static ArrayList<String> nextCharArray(){return myconv(next(), NOCHAR);}
	static ArrayList<Integer> nextIntArray(){
		ArrayList<Integer> ret = new ArrayList<Integer>(OBJECT_MEMORY);
		ArrayList<String> input = nextStrArray();
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<Long> ret = new ArrayList<Long>(OBJECT_MEMORY);
		ArrayList<String> input = nextStrArray();
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	static final int HAN = 8;
	static final int NL = 9;
	static final int NOCHAR = 0;
	static String myconv(Object list, int no){//only join
		String joinString = "";
		if(no == HAN){
			joinString = " ";
		}else if(no == NL){
			joinString = "\n";
		}
		if(list instanceof String[]){
			return String.join(joinString,(String[])list);
		}else if(list instanceof ArrayList){
			return String.join(joinString,(ArrayList)list);
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = (no == NOCHAR) ? "" : " ";
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
	}
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();
		long mae = System.currentTimeMillis();
		solve();flush();
		long ato = System.currentTimeMillis();
		myerr("time : " + (ato - mae) + "ms");
		myerr("memory : " + ((rt.totalMemory() - rt.freeMemory()) / 1024) + "KB");
	}
	//Don't have to see. end------------------------------------------
	static void solve(){//Here is the main function
		ArrayList<Long> one = nextLongArray();
		long A = one.get(0) - 1;
		long B = one.get(1);
		long C = one.get(2);
		long D = one.get(3);
		long BC = (B / C);
		long BD = (B / D);
		long BCD = (B / lcm(C, D));
		long Ball = B - (BC + BD) + BCD;

		long AC = (A / C);
		long AD = (A / D);
		long ACD = (A / lcm(C, D));
		long Aall = A - (AC + AD) + ACD;
		myout(Ball - Aall);

	}
	//Method addition frame start
public static long lcm(long m, long n) {return Math.max(m,n) / gcd(m, n) * Math.min(m,n);}
public static long gcd(long m, long n) {return n != 0 ? gcd(n, m % n) : m;}
	//Method addition frame end
}