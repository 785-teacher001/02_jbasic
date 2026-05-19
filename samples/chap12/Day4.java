public class Day4 {
	private int year;
	private int month;
	private int date;

	public Day4(int y, int m, int d) {
		year = y;
		month = m;
		date = d;
	}

	public Day4(int y, int m) {
		year = y;
		month = m;
		date = 1;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public String formatDay() {
		return year + "年" + month + "月" + date + "日";
	}
}
