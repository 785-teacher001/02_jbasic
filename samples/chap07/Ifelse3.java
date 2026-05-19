import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("英語の点数を入力してください:");
		int eng = scan.nextInt();
		System.out.print("数学の点数を入力してください:");
		int math = scan.nextInt();

		if ((eng >= 80) && (math >= 70)) {
			System.out.println("合格です。");
		} else {
			System.out.println("不合格です");
		}

		scan.close();
	}
}
