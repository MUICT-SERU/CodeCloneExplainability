import java.util.*;
class Main{

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) 
    arr[i] = sc.nextInt();
    long res =0;
    for(int i=1; i<n; i++) {
     if(arr[i-1]>arr[i]){
     res += arr[i-1]-arr[i];
     arr[i] = arr[i-1];
     }
     }
    System.out.println(res);
     //   System.out.println("Hello World");
    }
}
