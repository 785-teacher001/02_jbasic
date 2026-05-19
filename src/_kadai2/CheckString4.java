package _kadai2;

import java.util.Scanner;

public class CheckString4 {

	public static void main(String[] args) {
		// 1. 入力値をプログラムに取り込むオブジェクトをインスタンス化
		try (Scanner scanner = new Scanner(System.in)) {
			// 2. 入力する文字列の個数を取得
			System.out.print("文字列の個数を入力してください：");
			int repeat = scanner.nextInt();
			// 3. 入力した数の個数の要素を持つ配列を用意
			String[] inputs = new String[repeat]; // 配列の要素数を変数で指定可
			// 4. 配列に入力値を格納
			for (int i = 0; i < repeat; ++i) {
				System.out.print((i + 1) + "つ目の文字列を入力してください：");
				inputs[i] = scanner.next();
			}
			// 5. 配列の要素の最大文字列を取得
			int maxLength = 0;    // 文字数の最大値
			String maxInput = ""; // 最大文字数の文字列
			for (String input : inputs) {
				if (input.length() >= maxLength) {
					maxLength = input.length();
					maxInput = input;
				}
			}
			// 6. 最大値とその文字列を表示
			System.out.println("最も長い文字列は「" + maxInput + "」です");
		}

	}

}
