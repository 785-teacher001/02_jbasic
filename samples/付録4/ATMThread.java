// 振込みを行うATM
class InATMThread extends Thread {
	Account ac;

	InATMThread(Account ac) {
		this.ac = ac;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			ac.deposit(1000);
			System.out.println("1000円、振込みました");
		}
	}
}

// 引き出しを行うATM
class OutATMThread extends Thread {
	Account ac;

	OutATMThread(Account ac) {
		this.ac = ac;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			ac.withdraw(1000);
			System.out.println("1000円、引き出しました");
		}
	}
}
