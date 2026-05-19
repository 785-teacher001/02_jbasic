public class UseCar {
	public static void main(String[] args) {
		Car c1; 	// 参照変数の宣言
		c1 = new Car(); // インスタンスの生成
		// 車オブジェクトの初期化
		c1.maker = "HONDA";
		c1.displacement = 2000;
		c1.color = "青";

		// 車を使う
		c1.start();
		c1.curve();
		c1.stop();
		// 車の情報を表示する
		System.out.println("c1のメーカーは" + c1.maker + "です");
		System.out.println("c1の色は" + c1.color + "です");
	}
}
