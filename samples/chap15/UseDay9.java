public class UseDay9 {
	public static void main(String[] args) {
		Day9 d1 = new Day9(2010, 6, 7);
		Day9 d2 = new Day9(2010, 6, 7);
		if (d1.equals(d2)) {
			System.out.println("d1とd2は同じ日付です");
		} else {
			System.out.println("d1とd2は違う日付です");
		}
	}
}
