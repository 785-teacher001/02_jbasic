class UseATM {
	public static void main(String[] args) {
		// 残高３万円の口座を一つだけ生成
		Account ac = new Account(30000);
		// 振込み用ATMと引き出し用ATMを生成
		// 同じ口座を２つのATMに渡す
		InATMThread in = new InATMThread(ac);
		OutATMThread out = new OutATMThread(ac);
		// スレッド開始
		in.start();
		out.start();
		// ２つのスレッド終わるのを待つ
		try {
			in.join();
			out.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 口座の残高を表示する
		System.out.println("残高：" + ac.getBalance());
	}
}
