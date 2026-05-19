public class UsePhone3 {
	public static void main(String[] args) {
		HandyPhone3 h = new HandyPhone3();
		h.setNo("090-8888-6666");
		h.setMailAddress("abc@aaa.com");
		System.out.println("HandyPhone3を使う");
		h.tel("080-444-5555");
		h.mail("myfriend@zzz.yyy.com");
		h.info();
	}
}
