import java.util.Scanner;
class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   boolean flag = true;

   for(int i=0;i<n;i++) {
	   int a = sc.nextInt();
	   if(a%2==0&&((a%3)!=0)&&((a%5)!=0)) {
		   flag=false;
	   }
   }
   	System.out.println(flag?"APPROVED":"DENIED");
 }
}