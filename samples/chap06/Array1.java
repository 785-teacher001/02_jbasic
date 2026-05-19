package samples.chap06;

public class Array1 {
	public static void main(String[] args) {
		// 配列の宣言とインスタンス化
		int[] ary; // 配列の宣言：要素がint型である配列aryを用意する
		ary = new int[4]; // 4個のint型の要素の配列をメモリ上に確保して、
						  // その先頭要素の番地を配列aryに代入する
		
		// 配列の再利用：要素にリテラル値を代入
		ary[0] = 101; // 先頭要素に整数10を代入
		ary[1] = 15; // 2番目の要素に整数15を代入
		ary[2] = 12;
		ary[3] = 8;  // 末尾要素（インデックスが要素数-1である要素）に整数8を代入


		// 配列の再利用：要素の参照
		System.out.println("インデックス0の要素の値は" + ary[0] + "です。");
		int sum = ary[0] + ary[1] + ary[2] + ary[3];
		System.out.println("配列の要素の合計は" + sum + "です。");
	}
}
