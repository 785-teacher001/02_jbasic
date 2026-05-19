package samples.chap08;

public class BreakSample {
	public static void main(String[] args) {
		int[] a = { 10, -3, 5, 7, 9, 100, 30, -3 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 7) {
				System.out.println("ラッキー７が見つかりました。");
				//break;
				continue;
			}
			System.out.println("まだ見つかりません");
		}
		System.out.println("処理を終了します");
	}
}
