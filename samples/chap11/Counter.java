public class Counter {
	int counter = 1;

	void countUp() {
		counter++;
	}

	void countUp(int num) {
		counter += num;
	}

	int getCount() {
		return counter;
	}
}