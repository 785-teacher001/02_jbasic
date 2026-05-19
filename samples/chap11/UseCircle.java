public class UseCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		c1.x = 0;
		c1.y = 0;
		c1.r = 10.0;

		c2.x = 50;
		c2.y = 10;
		c2.r = 30.0;

		System.out.println("c1の中心の座標は(" + c1.x + "," + c1.y + ")");
		System.out.println("c1の面積は" + c1.area());
		System.out.println("c2の中心の座標は(" + c2.x + "," + c2.y + ")");
		System.out.println("c2の面積は" + c2.area());
		System.out.println("円周率の値は" + Circle.PI);
	}
}
