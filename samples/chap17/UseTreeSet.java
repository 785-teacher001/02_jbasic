import java.util.*;

public class UseTreeSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("Hello");
		set.add("Java");
		set.add("78");
		set.add("Java");
		set.add("123");
		for (String elem : set) {
			System.out.println(elem);
		}
	}
}
