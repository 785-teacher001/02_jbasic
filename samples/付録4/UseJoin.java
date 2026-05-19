class SummaryAThread extends Thread {
	public void run() {
		try {
			System.out.println("集計処理Aを実行中...");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class SummaryBThread extends Thread {
	public void run() {
		try {
			System.out.println("集計処理Bを実行中...");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class UseJoin {
	public static void main(String[] args) {
		SummaryAThread at = new SummaryAThread();
		SummaryBThread bt = new SummaryBThread();

		at.start();
		bt.start();

		// ２つのスレッドが終わるのを待つ
		try {
			at.join();
			bt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 改めて全体の集計結果を処理する
		System.out.println("全体の集計が終了しました");
	}
}