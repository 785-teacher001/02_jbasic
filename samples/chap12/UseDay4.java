public class UseDay4 {
	public static void main(String[] args) {
		Day4 d1 = new Day4(2012, 3, 3);
		Day4 d2 = new Day4(1999, 6);

		System.out.println("インスタンスd1の年は" + d1.getYear() + "年");
		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		System.out.println("インスタンスd2の日付は" + d2.formatDay());
	}
}
