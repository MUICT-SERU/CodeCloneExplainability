import java.util.*;

class Main{
    public static void main(String[] args){
	int alpha[] =new  int[26];
	Scanner sc = new Scanner(System.in);
	String bun = sc.next();
	char[] block = bun.toCharArray();

	for(int i = 0;i<bun.length();i++){
	    alpha[(int)block[i]-'a'] +=1; 
	    
	}
	int even = 0;
	for(int i = 0;i<26;i++){
	    if(alpha[i]%2 !=0){
		even = 1;
	    }
	}

	if(even == 0){System.out.println("Yes");}else{System.out.println("No");}
	
    }

}
