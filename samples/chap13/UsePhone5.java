public class UsePhone5 {
	public static void main(String[] args) {
		Phone4 p = new HandyPhone4("090-8888-6666", "abc@aaa.com");
		System.out.println("HandyPhoneをPhoneとして使う");
		p.tel("080-444-5555");
	}
}
