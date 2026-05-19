public class ShowPrice {
	public static void main(String[] args) {
		int price1 = 500;
		double discountPrice = price1 * 0.8; // 20%オフ
		double tax = 0.1; // 消費税
		double taxPrice1 = discountPrice * (1 + tax); // 消費税付きの値段
		price1 = (int) taxPrice1; // 小数点を切り捨てる
		System.out.println("1つ目の商品は" + price1 + "です。");
		// 同じことをもう一度行う
		int price2 = 800;
		discountPrice = price2 * 0.8; // 20%オフ
		tax = 0.1; // 消費税
		double taxPrice2 = discountPrice * (1 + tax); // 消費税付きの値段
		price2 = (int) taxPrice2; // 小数点を切り捨てる
		System.out.println("2つ目の商品は" + price2 + "です。");
	}
}
