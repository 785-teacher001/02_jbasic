package _kadai2;

public class IntegerArray2 {

	public static void main(String[] args) {
		// 配列「1, 7, 2, 7, 3」を宣言
		int[] numbers = new int[] {1, 7, 2, 7, 3};
		// 拡張for文を用いて合計を計算
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		// 合計の表示
		System.out.println("合計は" + sum + "です");
	}

}
