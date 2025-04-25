package quiz;

public class Score {
	
	public static void main(String[] args) {
		// kor, eng, com, name -> total, avg 구하는 프로그램 작성
		int kor = 90, eng = 88, com = 100, total;
		String name = "doyeon";
		double avg = 0;
		
		total = kor + eng + com;
		avg = total / 3.;
		System.out.println(name + "님의 성적처리");
		System.out.println("kor: " + kor + "\teng: " + eng + "\tcom" + com + "\ntotal: " + total);
		System.out.printf("avg: %.2f", avg);
	}

}
