public class ExceptionTest5 {
	public static void main(String[] args) {
		try {
			int i = 10, j = 0;
			System.out.println("メソッド呼び出し前");
			int k = calc(i, j);
			System.out.println("メソッド呼び出し後");
			System.out.println("K = " + k);
		} catch (ArithmeticException e) {
			System.out.println("メソッド呼び出し元の例外");
			System.out.println("エラー：0で除算しました");
			e.printStackTrace();
		}
	}

	static int calc(int i, int j) {
		int ans;
		ans = i / j;
		return ans;
	}
}
