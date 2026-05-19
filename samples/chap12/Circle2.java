public class Circle2 {
	static double PI = 3.14;
	int x;
	int y;
	double r;

	Circle2() {
		x = 0;
		y = 0;
		r = 10.0;
	}

	Circle2(int x1, int y1, double r1) {
		x = x1;
		y = y1;
		r = r1;
	}

	double area() {
		return r * r * PI;
	}
}
