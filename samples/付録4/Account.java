class Account {
	private long balance; // 残高

	public long getBalance() {
		return balance;
	}

	// コンストラクタ
	Account(long balance) {
		this.balance = balance;
	}

	// 引き出しメソッド
	void withdraw(long amount) {
		// データベースなどを利用する代わりに
		// 少し時間がかかることをsleep()で行う
		try {
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
	void deposit(long amount) {
		// データベースなどを利用する代わりに
		// 少し時間がかかることをsleep()で行う
		try {
			Thread.sleep(200);
			long temp = balance;
			Thread.sleep(200);
			temp += amount;
			Thread.sleep(200);
			balance = temp;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
