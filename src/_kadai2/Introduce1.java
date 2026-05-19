package _kadai2;

public class Introduce1 {

	public static void main(String[] args) {
		// 1. 文字列配列hobbiesを生成
		String[] hobbyList = new String[] {"ダンス", "映画", "バイク"};
//		String[] hobbyList = {"ダンス", "映画", "バイク"};
		// 2. 拡張for文を用いて要素を表示
		System.out.println("私の趣味は");
		for (String hobby : hobbyList) {
			System.out.println("・" + hobby);
		}
		System.out.println("です");

	}

}
