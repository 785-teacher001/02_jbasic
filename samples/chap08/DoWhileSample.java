import java.util.Scanner;

public class DoWhileSample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.print("パスコードを入力してください:");
			num = scan.nextInt();
		} while (num != 5);

		System.out.println("認証されました。");
		scan.close();
	}
}
