import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PackageTest4 {
	public static void main(String[] args) {
		DateTimeFormatter formatter =
				DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime time1 = LocalDateTime.now();
		System.out.println(time1.format(formatter));
		// またはフルネームで使用する
		java.time.LocalDateTime time2 = java.time.LocalDateTime.now();
		System.out.println(time2.format(formatter));
	}
}
