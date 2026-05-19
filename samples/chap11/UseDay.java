public class UseDay {
	public static void main(String[] args) {
		Day d1 = new Day();
		Day d2 = new Day();

		d1.year = 2007;
		d1.month = 12;
		d1.date = 30;

		d2.year = 1995;
		d2.month = 3;
		d2.date = 5;

		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		System.out.println("インスタンスd2の日付は" + d2.formatDay());
	}
}
