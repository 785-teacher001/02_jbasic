package _kadai2;

public class IntegerArray3 {

	public static void main(String[] args) {
		// 配列「1, 7, 2, 7, 3」を宣言
		int[] numbers = new int[] {1, 7, 2, 7, 3};
		// 拡張for文を用いて「要素が7である要素の個数」をカウント
		int count = 0;
		for (int number : numbers) {
			if (number == 7) {
				count++;
			}
		}
		// カウントの表示
		System.out.println(count + "ありました");
	}

}
