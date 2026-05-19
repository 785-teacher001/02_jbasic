public class ExceptionTest4 {
	public static void main(String[] args) {
		try {
			System.out.println("try文中");
			int[] a = new int[2];
			a[0] = 5;
			a[2] = 4;
			int i = 10, j = 0;
			int k = i / j;
			System.out.println("K = " + k);
		} catch (ArithmeticException e) {
			System.out.println("catch文中");
			System.out.println("エラー：0で除算しました");
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch文中");
			System.out.println("配列のインデックスをオーバーしました");
			e.printStackTrace();
		} finally {
			System.out.println("finally文中");
		}
		System.out.println("プログラム終了");
	}
}
