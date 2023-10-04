import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][][] dormitory = new int[4][3][10]; //??????????????????
		int b,f,r,v;
		
		//?±?????????°?????¨????????????????¨????
		for(int i=0; i<n; i++){
			String[] str = br.readLine().split(" ");
			b = Integer.parseInt(str[0])-1;
			f = Integer.parseInt(str[1])-1;
			r = Integer.parseInt(str[2])-1;
			v = Integer.parseInt(str[3]);
			
			dormitory[b][f][r] += v; //v????????????????????????????????§???????????????
		}
		
		//?????????????±?????????°?????¨???
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<10; k++){
					System.out.print(" "+dormitory[i][j][k]);
				}
				System.out.println();
			}
			if(i!=3){
				System.out.println("####################");
			}
		}
	}
}