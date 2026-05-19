public class UseFruit {
	public static void main(String[] args) {
		Fruit[] fruits = { new Apple(), new Melon(), new Orange() };

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i].whatColor());
		}
	}
}
