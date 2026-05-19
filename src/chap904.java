import java.util.Scanner;

public class chap904 {

	public static void main(String[] args) {
		// 1. 入力値をプログラムに取り込むオブジェクトをインスタンス化
		try (Scanner scanner = new Scanner(System.in)) {
			// 2. 入力値を取得
			System.out.print("西暦年を入力してください：");
			int year = scanner.nextInt();
			// 3. 入力値から閏年を計算してメッセージを取得
			String message = judgeLeapYear(year);
			// 4. メッセージを表示
			System.out.println(message);
		}

	}
	
	static boolean judgeLeapYear(int year) {
		boolean judgement = false;
		if (year % 400 == 0) {
			judgement = true;
		} else {
			if (year % 100 > 0  year % 4 ==0 ) {
				judgement = true;
			}
		}
		return judgement;
	}

}
