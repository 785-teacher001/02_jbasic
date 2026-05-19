public class UsePhone2 {
	public static void main(String[] args) {
		HandyPhone2 h = new HandyPhone2();
		h.no = "090-8888-6666";
		h.mailAddress = "abc@aaa.com";
		System.out.println("HandyPhone2を使う");
		h.tel("080-444-5555");
		h.mail("myfriend@zzz.yyy.com");
		h.info();
	}
}
