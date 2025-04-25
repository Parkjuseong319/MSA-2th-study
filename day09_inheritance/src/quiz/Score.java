package quiz;

import java.util.Scanner;

public class Score {
	protected int kor, eng, com, total;
	protected double avg;
	String name;
	char grade;
	
	public Score() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		this.name = sc.next();
		System.out.print("국어: ");
		this.kor = sc.nextInt();
		System.out.print("영어: ");
		this.eng = sc.nextInt();
		System.out.print("전산: ");
		this.com = sc.nextInt();
	}
	
	public int calc_total() {
		this.total = kor + eng + com;
		return total;
	}
	
	public double calc() {
		this.avg = calc_total() / 3.0 ;
		return avg;
	}
	
	public char grade() {
		if(this.avg >= 90) this.grade = 'A';
		else if(this.avg >= 80) this.grade = 'B';
		else if(this.avg >= 70) this.grade = 'C';
		else if(this.avg >= 60) this.grade = 'D';
		else this.grade = 'F';
		
		return grade;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
}
