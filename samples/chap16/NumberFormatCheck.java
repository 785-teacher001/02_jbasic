import java.util.Scanner;

public class NumberFormatCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("整数を入力してください：");
		String numStr = scan.next();

		try {
			int num = Integer.parseInt(numStr);
			System.out.println("入力された整数は：" + num);
		} catch (NumberFormatException e) {
			System.out.println("整数を入力してください");
		} finally {
			scan.close();
		}
	}
}
