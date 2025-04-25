package Quiz;

public class Ex02Quiz {
	public static void main(String[] args) {
		int su = 12345;
		
		// 시 : 분 : 초 구하기
		System.out.println(su/3600 + ":" + (su%3600/60)+":"+(su%3600%60));
	}
}