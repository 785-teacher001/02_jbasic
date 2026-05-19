public class Day7 {
	int year;
	int month;
	int date;

	public Day7(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public String toString() {
		return year + "年" + month + "月" + date + "日";
	}
}