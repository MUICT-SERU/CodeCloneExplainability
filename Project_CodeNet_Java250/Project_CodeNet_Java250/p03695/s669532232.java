import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ex=0;
		int[] h=new int[8];
		for(int i=0;i<8;i++){h[i]=0;}
		for(int i=0;i<n;i++){
			int buf=sc.nextInt();
			for(int j=0;j<8;j++){
				if(buf<=399+j*400){
					h[j]++;
					break;
				}
				if(j==7){
					ex++;
				}
			}
		}
		int min=0;
		for(int i=0;i<8;i++){
			if(h[i]>=1){
				min++;
			}
		}
		int max=min+ex;
		if(min==0){
			min=1;
		}

		System.out.println(min+" "+max);
	}

}
