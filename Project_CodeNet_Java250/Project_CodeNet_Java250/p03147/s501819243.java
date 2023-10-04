import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static void main(String[] args) throws Exception {
		solution(args);
		if(in!=null){
			in.close();
		}
	}

	public static void solution(String[] args) throws Exception{
		int N = nextInt();

		long[] h = nextLongs();
		long ans =0;
		int st=0;

		while(st!=N){
			for(int i=st;i<N;i++){
				if(h[st]==0){
					st=st+1;
				}else{
					break;
				}
			}
			long min=Long.MAX_VALUE;
			int eIdx=N;
			for(int i=st;i<N;i++){
				if(h[i]==0){
					eIdx=i;
					break;
				}
				min=Math.min(min, h[i]);
			}
			for(int i=st;i<eIdx;i++){
				h[i]-=min;
			}
			if(min!=Long.MAX_VALUE){
				ans+=min;
			}
		}
		System.out.println(ans);
	}





	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}

}

