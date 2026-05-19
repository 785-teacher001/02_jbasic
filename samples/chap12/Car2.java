public class Car2 {
	String maker; 		// メーカー
	int displacement;	// 排気量
	String color; 		// 色

	Car2() { // 特に指定がない場合のデフォルト設定を考える
		maker = "TOYOTA";
		displacement = 1000;
		color = "白";
	}

	Car2(String m, int d, String c) {
		maker = m;
		displacement = d;
		color = c;
	}

	void start() {
		System.out.println("発進します");
	}

	void stop() {
		System.out.println("止まります");
	}

	void curve() {
		System.out.println("曲がります");
	}
}
