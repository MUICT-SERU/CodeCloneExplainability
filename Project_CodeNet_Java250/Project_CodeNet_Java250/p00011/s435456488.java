import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int n=sc.nextInt();
		int[] wArr=new int[w];
		for(int i=0;i<w;i++){
			wArr[i]=i+1;
		}
		for(int i=0;i<n;i++){
			String[] ab=sc.next().split(",");
			int a=Integer.parseInt(ab[0])-1;
			int b=Integer.parseInt(ab[1])-1;
			int box=wArr[a];
			wArr[a]=wArr[b];
			wArr[b]=box;
		}
		for(int i=0;i<w;i++){
			System.out.println(wArr[i]);
		}
	}
}