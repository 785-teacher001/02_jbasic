// 振込みを行うATM
class InATMThread2 extends Thread {
	Account2 ac;

	InATMThread2(Account2 ac) {
		this.ac = ac;
	}

	public void run() {
		for (int i = 0; i < 6; i++) {
			ac.deposit(1000);
			System.out.println("1000円、振込みました");
		}
	}
}

// 引き出しを行うATM
class OutATMThread2 extends Thread {
	Account2 ac;

	OutATMThread2(Account2 ac) {
		this.ac = ac;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			ac.withdraw(2000);
			System.out.println("2000円、引き出しました");
		}
	}
}
