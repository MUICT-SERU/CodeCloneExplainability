import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] num =new int[w];
		for(int i=0;i<w;i++){
			num[i]=i+1;
		}

		String [][] scombo =new String[n][2];
		int [][] combo =new int[n][2];

		//??\?????????????????¨????????\?????????????????§????????????
		for(int i=0;i<n;i++){
			String str =sc.next();
			scombo[i]=str.split(",");
		}



		//????????????????????°??????????????????
		for(int i=0;i<n;i++){
			for(int j=0;j<2;j++){
				combo[i][j]=Integer.parseInt(scombo[i][j]);
			}
		}
		//????????????
		for(int i=0;i<n;i++){
			int x = num[combo[i][0]-1];
			num[combo[i][0]-1]=num[combo[i][1]-1];
			num[combo[i][1]-1]=x;
		}
		//??????
		for(int i=0;i<w;i++){
			System.out.println(num[i]);
		}


	}

}