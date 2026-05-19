package _kadai2;

import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
		// 1. 入力値をプログラムに取り込むオブジェクトをインスタンス化
		try (Scanner scanner = new Scanner(System.in)) {
			// 2. 入力値を取得
			System.out.print("パスワードを入力してください：");
			
			while (true) {
				// 入力値を取得
				String input = scanner.next();
				// 3. 入力値を判定
				if (input.equals("himitu")) {
					// 3-1. 一致すれば終了
					break;
				} else {
					// 3-2. 一致しない場合は2.に戻る
					System.out.println("再入力してください：");
				}
			}
			
			// 4. ログイン成功メッセージの表示
			System.out.println("ログインできました");
			
		}

	}

}
