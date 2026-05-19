public class UseDay8 {
	public static void main(String[] args) {
		Day7 d1 = new Day7(2010, 6, 7);
		Day7 d2 = new Day7(2010, 6, 7);
		if (d1.equals(d2)) {
			System.out.println("d1とd2は同じ日付です");
		} else {
			System.out.println("d1とd2は違う日付です");
		}
	}
}
