package samples.repeat;

public class total {

	public static void main(String[] args) {
		int i = 100;
		// 1から10までの和を計算するプログラム
		// 1. 和を格納する変数
		int total = 0;
		// 2. 反復構造で和を計算
		for (i = 1; i <= 10; i++) {
			// 変数iはfor文のコードブロック内でのみ有効
//			total = total + i;
			total += i;
		}
//		int i = -1;
		System.out.println(i); // Syntax Error（文法エラー）
		// 3. 「1から10までの和は110です」のように表示
		System.out.println("1から10までの和は" + total + "です");
	}

}
