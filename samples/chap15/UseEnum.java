public class UseEnum {
	public static void main(String[] args) {
		Eval eval = Eval.GOOD;
		
		switch (eval) {
		case EXCELLENT:
			System.out.println("優です");
			break;
		case GOOD:
			System.out.println("良です");
			break;
		case FAIR:
			System.out.println("可です");
			break;
		}
	}
}