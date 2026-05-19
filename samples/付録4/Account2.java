class Account2 {
	private long balance; // 残高

	public long getBalance() {
		return balance;
	}

	// コンストラクタ
	Account2(long balance) {
		this.balance = balance;
	}

	// 引き出しメソッド
	synchronized void withdraw(long amount) {
		try {
			while (balance < amount) {
				System.out.println("残高が足りないので待つ");
				wait();
			}
			// データベースなどを利用する代わりに
			// 少し時間がかかることをsleep()で行う
			Thread.sleep(200);
			long temp = balance;
			Thread.sleep(200);
			temp -= amount;
			Thread.sleep(200);
			balance = temp;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 振込みメソッド
	synchronized void deposit(long amount) {
		// データベースなどを利用する代わりに
		// 少し時間がかかることをsleep()で行う
		try {
			Thread.sleep(200);
			long temp = balance;
			Thread.sleep(200);
			temp += amount;
			Thread.sleep(200);
			balance = temp;

			System.out.println("振り込んだので通知する");
			notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
