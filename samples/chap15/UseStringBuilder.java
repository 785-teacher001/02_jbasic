public class UseStringBuilder {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Java");
		System.out.println(builder);
		System.out.println("長さ：" + builder.length());
		System.out.println("容量：" + builder.capacity());
		
		// 追加
		builder.append("World");
		System.out.println(builder);
		// 挿入
		builder.insert(4, "言語");
		System.out.println(builder);
		//　置き換え
		builder.replace(4, 6, "Language");
		System.out.println(builder);
	}
}
