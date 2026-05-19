import java.util.Scanner;

public class Ifelse1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("整数を入力してください：");
		int num = scan.nextInt();

		if ((num % 2) == 0) {
			System.out.println("numは偶数です");
			System.out.println("複数の命令文をブロックに入れることができます");
		} else {
			System.out.println("numは奇数です");
		}

		scan.close();
	}
}
