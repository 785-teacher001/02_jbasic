public class ForSample4 {
	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 10, 20 }, { 100, 200, 300, 400 } };
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j]);
			}
		}
	}
}
