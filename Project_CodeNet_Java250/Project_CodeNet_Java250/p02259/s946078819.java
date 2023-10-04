import java.util.Scanner;
public class Main {
	static void swap(int[] data,int x){
		int tmp=data[x];
		data[x]=data[x-1];
		data[x-1]=tmp;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int data[]=new int[N];
		int count=0;
		for(int i=0;i<N;i++){
			data[i]=scan.nextInt();
		}
		for(int i=0;i<N;i++){
			for(int j=N-1;i+1<=j;j--){
				if(data[j]<data[j-1]){
					swap(data,j);
					count++;
				}
			}
		}
		for(int i=0;i<N;i++){
			if(i==0) System.out.print(data[i]);
			else System.out.print(" "+data[i]);
		}
		System.out.println();
		System.out.println(count);
		scan.close();
		
	}
	
}