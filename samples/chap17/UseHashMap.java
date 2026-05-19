import java.util.*;

public class UseHashMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("honda", "0120-11-3333");
		map.put("kagawa", "0423-22-6666");
		map.put("nagatomo", "03-678-5678");

		System.out.println("hondaの電話番号：" + map.get("honda"));
		System.out.println("kagawaの電話番号：" + map.get("kagawa"));
		System.out.println("nagatomoの電話番号：" + map.get("nagatomo"));
	}
}
