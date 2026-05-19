public class UseDay5 {
	public static void main(String[] args) {
		Day5 d1 = new Day5(2012, 3, 3);
		Day5 d2 = new Day5(1999, 6);

		d1.setMonth(5);
		System.out.println("インスタンスd1の年は" + d1.getYear() + "年");
		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		System.out.println("インスタンスd2の日付は" + d2.formatDay());
	}
}
