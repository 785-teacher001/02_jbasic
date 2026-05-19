class UseATM2 {
	public static void main(String[] args) {
		// 残高0円の口座を一つだけ生成
		Account2 ac = new Account2(0);
		// 振込み用ATMと引き出し用ATMを生成
		// 同じ口座を２つのATMに渡す
		InATMThread2 in = new InATMThread2(ac);
		OutATMThread2 out = new OutATMThread2(ac);
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
