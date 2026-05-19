import java.time.LocalDateTime;

public class UseLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();  // 現在日時の取得

		int year = time.getYear();					// 現在の年を取得
		int month = time.getMonthValue();		// 現在の月を取得
		int day = time.getDayOfMonth();			// 現在の日を取得
		int hour = time.getHour();					// 現在の時を取得
		int minute = time.getMinute();			// 現在の分を取得
		int second = time.getSecond();			// 現在の秒を取得

		// 現在の年、月、日、時、分、秒を表示
		System.out.println(year + "/" + month + "/" + day + " " +
						   hour + ":" + minute + ":" + second);
	}
}
