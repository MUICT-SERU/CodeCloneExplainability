import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String ans="";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='1'){
                ans+='9';
            }else{
                ans+='1';
            }
        }
        System.out.print(ans+"\n");
        
    }
}