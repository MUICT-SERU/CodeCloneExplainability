import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		// 3????????°???????????????????????§????????????
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		
		String array[] = line.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
		
		
		// 0??\???100??\????????°????????\??????????????´???????????????????????????
		if ( (a>=0)&&(a<=100) && (b>=0)&&(b<=100) && (c>=0)&&(c<=100) ) {
			// a < b < c ??????????????????Yes???????????????????????????????????°No???????????????
			if ( (a<b)&&(b<c) ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		
		
	
		
	}

}