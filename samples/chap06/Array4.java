public class Array4 {
	public static void main(String[] args) {
		int[] a = { 0, 10, 20, 30, 40 };
		int[] m;

		m = a;
		System.out.println("a[2] = " + a[2]);
		System.out.println("m[2] = " + m[2]);

		m[2] = 100;
		System.out.println("a[2] = " + a[2]);
		System.out.println("m[2] = " + m[2]);
	}
}
