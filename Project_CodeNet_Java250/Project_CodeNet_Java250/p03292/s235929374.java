import java.util.Arrays;import java.util.Scanner;public class Main{public static void main(String[] args){int output=0;Scanner scanner=new Scanner(System.in);String s=scanner.nextLine();scanner.close();String[] str=s.split(" ",0);int[] input=new int[str.length];for(int i=0;i<str.length;i++){input[i]=Integer.parseInt(str[i]);}Arrays.sort(input);for(int i=0;i<input.length-1;i++){output+=input[i+1]-input[i];}System.out.println(output);}}