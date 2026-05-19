public class UsePerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "@$%&&&";
		p.age = -400;

		System.out.println("私の名前は" + p.name + "です。年齢は" + p.age + "です。");
	}
}
