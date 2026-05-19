package _kadai2;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		// 1. 入力値をプログラムに取り込むオブジェクトをインスタンス化
		try (Scanner scanner = new Scanner(System.in)) {
			// 2. キーボードから繰り返し文字列を取得
			System.out.print("文字列を入力してください：");
			String input = scanner.next();
			// 3. 入力値の文字数を取得
			int length = input.length();
			// 4. 取得した文字数を表示
			System.out.println("文字列の長さは" + length +"文字です");
		}

	}

}
