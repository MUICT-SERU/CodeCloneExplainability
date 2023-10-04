/*
 * 2018 年 1 月某日、高木さんは書類を書いています。書類には、その日の日付を yyyy/mm/dd という形式で書き込む欄があります。例えば、2018 年 1 月 23 日は 2018/01/23 となります。
 * 
 * 書類を書き終えたあと、高木さんは日付欄の先頭に誤って 2017 と書いてしまっていたことに気がつきました。
 * 高木さんが日付欄に書いた文字列 S を入力すると、S の先頭の 4 文字を 2018 に修正して出力するプログラムを書いてください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            String s = sc.next();
            
            //出力
            System.out.println("2018/01/" + s.substring(8, 10));
            sc.close();
        }
    }
	