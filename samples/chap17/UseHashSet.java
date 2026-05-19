import java.util.*;

public class UseHashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
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
