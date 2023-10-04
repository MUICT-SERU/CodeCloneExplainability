

import java.util.Scanner;

public class Main{

	public static void main(String args[]) {

		//
		String sentence = "";
		int shuffle_times = 0;
		int shuffle_number = 0;
		StringBuffer input_sentence = null;
		String out = "";
		StringBuffer out_all = new StringBuffer(out);

		//
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			// 入力文字列
			sentence = sc.next();
			//入力文字列が_の場合は
			if(sentence.equals("-"))
			break;
			
			//
			input_sentence = new StringBuffer(sentence);
			// シャッフルする回数
			shuffle_times = sc.nextInt();

			while (sc.hasNext()) {
				// シャッフル枚数
				for (int i = 0; i < shuffle_times; i++) {

					//
					shuffle_number = sc.nextInt();
					// シャッフルしてカードの上に移動するものを、取ってくる
					StringBuffer add_sentence = new StringBuffer(
							input_sentence.substring(0, (shuffle_number)));
					// 上に移動するカードを元のカード列から削除
					input_sentence = input_sentence.delete(0,(shuffle_number));
					//シャッフルしたあとカード列
					input_sentence = add_sentence.insert(0, input_sentence);

				}
				out_all = out_all.append(input_sentence+"\n");
				break;
			}

		}
		System.out.print(out_all);
	}

}