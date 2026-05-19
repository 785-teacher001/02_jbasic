class UseAutoBoxing {
	public static void main(String[] args) {
		Integer num1 = 1; // Integer.valueOf(1)
		Integer num2 = 2; // Integer.valueOf(2)

		int num3 = num1 + num2; // num1.intValue() + num2.intValue()

		System.out.println(num1 + " + " + num2 + " = " + num3);
	}
}
