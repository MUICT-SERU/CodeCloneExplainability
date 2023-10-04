import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt();
		Map<Integer,Integer> m= new HashMap();
		for(int ii=0;ii<M;ii++){
			int i=sc.nextInt(),j=sc.nextInt();
			m.put(i, m.getOrDefault(i, 0)+1);
			m.put(j, m.getOrDefault(j, 0)+1);
		}
		for(int i=1;i<=N;i++){
			System.out.println(m.getOrDefault(i, 0));
		}
	}
}