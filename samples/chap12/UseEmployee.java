public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("木村", "大阪", 2010, 10, 20);
		Employee e2 = new Employee("吉田", "名古屋", new Day5(1993, 4, 8));

		e1.introduce();
		e2.introduce();
	}
}
