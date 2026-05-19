public class HandyPhone3 extends Phone3 {
	private String mailAddress;

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public void info() {
		System.out.println("電話番号=" + getNo() + 
						   ", メールアドレス=" + mailAddress);
	}

	public void mail(String to) {
		System.out.println(mailAddress + "から" + to + "へメールしました。");
	}
}
