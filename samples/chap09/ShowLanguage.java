public class ShowLanguage {
	public static void main(String[] args) {
		String[] languageList = getLanguageList();
		System.out.println("習得する言語一覧は下記の通りです。");
		for (int i = 0; i < languageList.length; i++) {
			System.out.println(languageList[i]);
		}
	}

	static String[] getLanguageList() {
		String[] list = { "C", "Java", "C#" };
		return list;
	}
}
