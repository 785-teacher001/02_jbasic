public class UseString {
	public static void main(String[] args) {
		String s1 = "This is a sample.";
		// 文字列の長さ
		System.out.println("length() : " + s1.length());
		// 文字の取り出し
		System.out.println("char : " + s1.charAt(3));	
		// 文字列の切り出し
		System.out.println("substring : " + s1.substring(3, 9));

		// 文字列の検索
		String s2 = "abcabcabcabcdefabc";
		System.out.println("index : " + s2.indexOf("def"));
		System.out.println("last : " + s2.lastIndexOf("abc"));

		// 文字列の変換
		String s3 = "AbCdEfG";
		System.out.println("UpperCase : " + s3.toUpperCase());
		System.out.println("LowerCase : " + s3.toLowerCase());

		// 文字列の比較
		String s4 = new String("This is a pen.");
		String s5 = new String("This is a pen.");
		if (s4.equals(s5)) {
			System.out.println("s4とs5は同じ文字列です");
		} else {
			System.out.println("s4とs5は違う文字列です");
		}
	}
}
