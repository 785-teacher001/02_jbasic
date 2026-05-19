package samples.repeat;

public class total2 {

	public static void main(String[] args) {
		// 1. 配列fruitsを宣言して、要素を設定「バナナ、メロン、モモ」
		String[] fruits = new String[3];
		fruits[0] = "バナナ";
		fruits[1] = "メロン";
		fruits[2] = "モモ";
		// 2. 配列の要素をすべて表示
		for (int j = 0; j < 3; j++) {
			System.out.println(fruits[j]);
		}
		// 3. 拡張forで書き換える
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
