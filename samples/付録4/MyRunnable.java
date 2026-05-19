class MyRunnable implements Runnable {
	public void run() {
		// 0.3秒ごとに５回Helloを出力する
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				Thread.sleep(300);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
