package quiz_score;

import java.util.ArrayList;
import java.util.Scanner;

public class Score {
	String no, name;
	int kor, eng, com;
	char grade;
	double avg;
	
	ArrayList list = new ArrayList<>();
	
	public Score() {
		this.no = "1";
		this.name = "zoo";
		this.kor = 90;
		this.eng = 90;
		this.com = 90;
		list.add(this.no);
		list.add(this.name);
		list.add(this.kor);
		list.add(this.eng);
		list.add(this.com);
		this.avg = calc(this.kor, this.eng, this.com);
		list.add(this.avg); 	// 평균
		list.add(calc_grade(this.avg));
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		list.add(sc.next());	// 번호
		list.add(sc.next());	// 이름
		kor = sc.nextInt();
		eng = sc.nextInt();
		com = sc.nextInt();
		this.avg = calc(kor, eng, com);
		list.add(kor);	// 국어
		list.add(eng);	// 영어
		list.add(com);	// 전산
		list.add(this.avg); 	// 평균
		list.add(calc_grade(this.avg));			// 학점
	}
	
	public void ViewStudent() {
		System.out.println("번호" + "\t이름 " + "\t국어 " + "\t 영어"+ "\t 전산"+ "\t 평균"+ "\t 학점");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
			if(i%7 == 6) System.out.println();
			else if(i == 6) System.out.println();
		}
		System.out.println();
	}
	
	public void InsertStudent(int no, String cont) {
		list.set(no, cont);
	}
	
	public void InsertStudent(int no, int score) {
		list.set(no, score);
		if(no%7 == 2) {
			list.set((no+3),calc((int)list.get(no), (int)list.get(no+1), (int)list.get(no+2) ));
		}else if(no%7 == 3) {
			list.set((no+3),calc((int)list.get(no-1), (int)list.get(no), (int)list.get(no+1)) );
		}else if(no%7 == 4) {
			list.set((no+3),calc((int)list.get(no-2), (int)list.get(no-1), (int)list.get(no) ));
		}
	}
	
	public void DeleteStudent(int no) {
		for (int i = 0; i < 7; i++) {
			list.remove(no);
		}
	}
	
	public double calc(int kor, int eng, int com) {
		double avg = 0.0;
		avg = (kor + eng + com) / 3.0;		
		return avg;
	}
	
	public char calc_grade(double avg) {
		int re = (int)(avg / 10);
		char grade = ' ';
		switch (re) {
		case 10: 
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F'; break;
		}
		return grade;
	}

}
