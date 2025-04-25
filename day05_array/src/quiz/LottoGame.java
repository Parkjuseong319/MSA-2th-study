package quiz;

public class LottoGame {
	public static void main(String[] args) {
		// 배열 사용없이
		for (int i = 0; i < 6; i++) {
			System.out.println((int)(Math.random()*45) + 1);
		}
	}

}
