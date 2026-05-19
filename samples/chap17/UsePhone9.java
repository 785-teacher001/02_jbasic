import java.util.*;

public class UsePhone9 {
	public static void main(String[] args) {
		List<Phone4> list = new ArrayList<Phone4>();
		
		list.add(new Phone4("0545-0000-1111"));
		list.add(new HandyPhone4("080-4444-3333", "aaa@ccc.jp"));
		list.add(new Phone4("03-3333-3333"));
		
		for (Phone4 p : list) {
			p.tel("0120-4444-4444");
		}
	}
}
