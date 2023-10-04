public class Main {
	
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String in = scan.nextLine();
		String[] ins = in.split(" ");
		int n = Integer.parseInt(ins[0]);
		int m = Integer.parseInt(ins[1]);
		int[] count = new int[n];
		for(int i=0; i<n; i++){
			count[i] = 0;
		}
		for(int i=0; i<m; i++){
			String ab = scan.nextLine();
			String[] tmp = ab.split(" ");
			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);
			count[a-1]++;
			count[b-1]++;
		}
		for(int i=0; i<n; i++){
			System.out.println(count[i]);
		}
	}
}