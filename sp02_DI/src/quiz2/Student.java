package quiz2;

import java.util.Scanner;

public class Student implements PersonInterface {
	private int kor, eng, com;
	
	public int total() {
		return this.kor + this.eng + this.com;
	}
	
	public float avg() {
		return total()/3.0f;
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수: ");
		this.kor = sc.nextInt();
		System.out.print("영어점수: ");
		this.eng = sc.nextInt();
		System.out.print("전산점수: ");
		this.com = sc.nextInt();
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("국어: " + kor + " 점\n영어: " + eng + "점\n전산: " + com +" 점");
		System.out.println("총점: " + total() +" 점\n평균: " + avg() + " 점");
	}
	

}
