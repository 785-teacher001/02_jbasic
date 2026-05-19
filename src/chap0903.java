import java.util.Scanner;

public class chap0903 {

	public static void main(String[] args) {
		// 1. 入力値をプログラムに取り込むオブジェクトをインスタンス化
		try (Scanner scanner = new Scanner(System.in)) {
			// 2. 入力値を取得
			System.out.print("点数を入力してください：");
			int score = scanner.nextInt();
			// 3. 入力値の判定：合否判定
			String message = judge(score);
			// 4. 判定結果を表示
			System.out.println(message);
		}
	}

}
