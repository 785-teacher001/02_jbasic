public class Div {
	public static void main(String[] args) {
		System.out.println("5/2の結果は" + (5 / 2) + "です");
		System.out.println("5/2.0の結果は" + (5 / 2.0) + "です");

		double d = 5.0;
		float f = 2.0f;
		double answer = d / f;
		System.out.println(answer);

		byte x = 5;
		byte y = 2;
		int answer2 = x / y;
		System.out.println(answer2);

		int i = 5;
		int j = 2;
		double answer3 = (double) i / j;
		System.out.println(answer3);
	}
}
