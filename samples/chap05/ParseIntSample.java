public class ParseIntSample {
	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1 + str2); 	// 連結演算子となり「123456」と出力
		int num1 = Integer.parseInt(str1); 	// 数字を整数に変換
		int num2 = Integer.parseInt(str2); 	// 数字を整数に変換
		System.out.println(num1 + num2); 	// 算術演算子となり「579」と出力
	}
}
