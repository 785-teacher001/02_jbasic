public class AddSample {
	public static void main(String[] args) {
		int a = add(3, 4); 		// aには7が入る
		int b = add(10, -4); 	// bには6が入る

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
