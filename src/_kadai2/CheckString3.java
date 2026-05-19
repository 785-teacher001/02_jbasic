package _kadai2;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		// 1. 入力値をプログラムに取り込むオブジェクトをインスタンス化
		try (Scanner scanner = new Scanner(System.in)) {
			// 2. 繰り返し回数を取得
			System.out.print("繰り返す回数を入力してください：");
			int repeat = scanner.nextInt();
			// 3. 繰り返し回数だけ入力値を取得し連結
			String inputs = "";
			for (int i = 0; i < repeat; ++i) {
				System.out.print((i + 1) + "つ目の文字列を入力してください：");
				String input = scanner.next();
				inputs += input;
				System.out.println(inputs);
			}
			
		}

	}

}
