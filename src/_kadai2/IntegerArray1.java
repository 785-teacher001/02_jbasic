package _kadai2;

public class IntegerArray1 {

	public static void main(String[] args) {
		// 配列「1, 7, 2, 7, 3」を宣言
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 7;
		numbers[2] = 2;
		numbers[3] = 7;
		numbers[4] = 3;
		// 拡張for文を利用して要素を表示
		for (int number : numbers) {
			System.out.println(number);
		}

	}

}
