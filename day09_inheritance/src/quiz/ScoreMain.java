package quiz;

public class ScoreMain {
	public static void main(String[] args) {
		Score s = new Score();
		System.out.println(s.name+"님의 성적표==========");
		System.out.println("국어: " + s.kor + " \t영어: " + s.eng + " \t전산: " + s.com);
		System.out.println("총점: " + s.calc_total() + " \t평균: " + s.calc() + " \t평점: " + s.grade());
	}
}
