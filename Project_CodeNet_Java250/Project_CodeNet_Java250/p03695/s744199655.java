import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int[] a = new int[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}

		int cnt = 0;
		int cnt2 = 0;

		boolean hasGray = false;
		boolean hasBrown = false;
		boolean hasGreen = false;
		boolean hasWater = false;
		boolean hasBlue = false;
		boolean hasYellow = false;
		boolean hasOrange = false;
		boolean hasRed = false;

		for(int i=0; i<N; i++){
			if(a[i]<=399){
				if(!hasGray){
					cnt++;
					hasGray = true;
				}
			}else if(a[i]<=799){
				if(!hasBrown){
					cnt++;
					hasBrown = true;
				}
			}else if(a[i]<=1199){
				if(!hasGreen){
					cnt++;
					hasGreen = true;
				}
			}else if(a[i]<=1599){
				if(!hasWater){
					cnt++;
					hasWater = true;
				}
			}else if(a[i]<=1999){
				if(!hasBlue){
					cnt++;
					hasBlue = true;
				}
			}else if(a[i]<=2399){
				if(!hasYellow){
					cnt++;
					hasYellow = true;
				}
			}else if(a[i]<=2799){
				if(!hasOrange){
					cnt++;
					hasOrange = true;
				}
			}else if(a[i]<=3199){
				if(!hasRed){
					cnt++;
					hasRed = true;
				}
			}else{
					cnt2++;
			}
		}

		if(cnt==0){
			cnt = 1;
			cnt2 = cnt2 - 1;
		}

		System.out.println(cnt + " " + (cnt + cnt2));

	}

}
