import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int sum = 0;

    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }

    Collections.sort(list);

    for(int i = 0; i < k ; i++){
        sum += list.get(i);
    }
    System.out.println(sum);

    
    

    


    
    


    


    
    


    
	}
}