package _kadai2;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		// 1. 入力値をプログラムに取り込むオブジェクトをインスタンス化
		try (Scanner scanner = new Scanner(System.in)) {
			// 2. 入力値を取得：ふたつの文字列を格納する変数を配列で用意
			String[] inputs = new String[2];
			System.out.print("１つ目の文字列を入力してください：");
			inputs[0] = scanner.next();
			System.out.print("２つ目の文字列を入力してください：");
			inputs[1] = scanner.next();
			
			// 3. ふたつの入力値を比較
			String message = "２つの文字列は";
			if (inputs[0].equals(inputs[1])) {
				message += "同じです";
			} else {
				message += "異なります";
			}
			
			// 4. 比較結果を表示
			System.out.println(message);
			
		}

	}

}
