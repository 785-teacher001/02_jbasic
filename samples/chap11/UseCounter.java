public class UseCounter {
	public static void main(String[] args) {
		Counter c = new Counter();
		System.out.println("カウンタの値：" + c.getCount());
		// 1増やす
		c.countUp();
		System.out.println("カウンタの値：" + c.getCount());
		// さらに３００増やす
		c.countUp(300);
		System.out.println("カウンタの値：" + c.getCount());
	}
}