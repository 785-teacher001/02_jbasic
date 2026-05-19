import java.util.Scanner;

public class Ifelse2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("数値を入力してください:");
		int num = scan.nextInt();

		if (num < 0) {
			System.out.println("numはマイナスの値です");
		}

		if ((num % 5) == 0)
			System.out.println("numは5の倍数です");

		System.out.println("プログラム終了");
		scan.close();
	}
}
