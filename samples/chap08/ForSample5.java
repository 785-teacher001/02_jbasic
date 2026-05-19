package samples.chap08;

public class ForSample5 {
	public static void main(String[] args) {
		int[] ary = { 10, 15, 12, 8 }; // 配列リテラル
		// 拡張for文を使用
		for (int data : ary) {
			System.out.println(data);
		}
	}
}
