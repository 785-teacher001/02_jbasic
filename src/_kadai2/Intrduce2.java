package _kadai2;

import java.util.Scanner;

public class Intrduce2 {

	public static void main(String[] args) {
		// try-with-resourcesを利用
		try (Scanner scanner = new Scanner(System.in)) {
			// 1. 名前の取得
			System.out.println("情報を登録します");
			System.out.print("名前：");
			String name = scanner.next();
			// 2. 趣味の取得
			String[] hobbies = new String[3];
			System.out.print("趣味1：");
			hobbies[0] = scanner.next();
			System.out.print("趣味2：");
			hobbies[1] = scanner.next();
			System.out.print("趣味3：");
			hobbies[2] = scanner.next();
			
			// 区切り線の表示
			System.out.println("---");
			
			// 3. 自己紹介を表示
			System.out.println("こんにちは" + name + "です");
			System.out.println("私の趣味は、");
			for (int i = 0; i < hobbies.length; i++) {
				System.out.println("・" + hobbies[i]);
			}
			System.out.println("です");
		}
	}

}
