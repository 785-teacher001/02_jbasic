public class UsePhone7 {
	public static void main(String[] args) {
		Phone4 p = new Phone4("090-8888-6666");
		System.out.println("PhoneをHandyPhoneとして使う");
		HandyPhone4 h = (HandyPhone4)p;
		h.mail("myfriend@xyz.com");
	}
}
