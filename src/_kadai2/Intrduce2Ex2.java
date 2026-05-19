package _kadai2;

import java.util.Scanner;

public class Intrduce2Ex2 {

	public static void main(String[] args) {
		// try-with-resourcesを利用
		try (Scanner scanner = new Scanner(System.in)) {
			// 1. 名前の取得
			System.out.print("名前：");
			String name = scanner.next();
			// 2. 趣味の取得
			String[] hobbies = new String[3];
			for (int i = 0; i < hobbies.length; ++i) {
				System.out.print("趣味" + (i + 1) +"：");
				hobbies[i] = scanner.next();
			}
			
			// 3. 自己紹介を表示
			System.out.println("こんにちは" + name+ "です");
			System.out.println("私の趣味は、");
			for (String hobby : hobbies) {
				System.out.println("・" + hobby);
			}
			System.out.println("です");
		}
	}

}
