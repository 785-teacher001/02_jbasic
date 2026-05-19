class UseMyThread {
	public static void main(String[] args) {
		System.out.println("プログラム開始");
		// 新しいスレッドオブジェクトを生成
		MyThread th = new MyThread();
		// マルチスレッドの開始
		th.start();
		// メインスレッドでは0.5秒ごとに３回「おはよう」
		// 出力する
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("おはよう");
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
