
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");

   //  String nyu=sc.nextLine();
int[] num=new int[3];
//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);
//int C=Integer.parseInt(nyu[2]);

 num[0]=Integer.parseInt(nyu[0]);
 num[1]=Integer.parseInt(nyu[1]);
 num[2]=Integer.parseInt(nyu[2]);


//double A=Double.parseDouble(nyu[0]);
//double B=Double.parseDouble(nyu[1]);
/*
switch(C){
case 7:
case 5:
case 3:
System.out.println("YES") ;
break;
default:
System.out.println("NO") ;

break;
}
*/

Arrays.sort(num);


System.out.println(num[2]-num[0]);


	}
}