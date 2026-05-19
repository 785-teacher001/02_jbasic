public class UsePhone8 {
	public static void main(String[] args) {
		Phone4 p = new Phone4("0545-0000-1111");
		HandyPhone4 h = new HandyPhone4("080-4444-3333", "aaa@ccc.jp");
		
		communicate(p);
		communicate(h);
	}
	
	public static void communicate(Phone4 p) {
		p.tel("02-3333-9999");
		// もしHandyPhoneならメールもする
		if (p instanceof HandyPhone4) {
			HandyPhone4 h = (HandyPhone4)p;
			h.mail("zzz@xxx.com");
		}
	}
}
