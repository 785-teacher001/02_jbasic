class UseMyRunnable {
	public static void main(String[] args) {
		System.out.println("プログラム開始");
		// 新しいRunnableオブジェクトを生成
		MyRunnable mr = new MyRunnable();
		// ThreadクラスのコンストラクタにRunnableオブジェクトを渡す
		Thread th = new Thread(mr);
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
