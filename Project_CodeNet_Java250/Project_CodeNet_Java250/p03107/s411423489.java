import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
//map.containsKey(A)
//Map<String, Integer> map = new HashMap<String, Integer>(n);
//ArrayList<String> cc = new ArrayList<>(n);

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(sc.next());
	boolean a=true;
	int ans=0;
	int aaa[]=new int[2];
	for(int i=0;i<str.length();i++) {
		aaa[str.charAt(i)-48]++;
	}
	if(aaa[0]>=aaa[1]) {
		ans=aaa[1]*2;
	}else {
		ans=aaa[0]*2;
	}
	p(ans);
 }
}
