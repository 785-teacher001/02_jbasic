public class UseInteger {
	public static void main(String[] args) {
		// 文字列を整数に変換
		int a = Integer.parseInt("123");
		System.out.println("a=" + a);

		// 2進数、8進数、16進数に変換
		System.out.println("aの2進数：" + Integer.toBinaryString(a));
		System.out.println("aの8進数：" + Integer.toOctalString(a));
		System.out.println("aの16進数：" + Integer.toHexString(a));
	}
}
