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
		System.out.print("��������: ");
		this.kor = sc.nextInt();
		System.out.print("��������: ");
		this.eng = sc.nextInt();
		System.out.print("��������: ");
		this.com = sc.nextInt();
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("����: " + kor + " ��\n����: " + eng + "��\n����: " + com +" ��");
		System.out.println("����: " + total() +" ��\n���: " + avg() + " ��");
	}
	

}
