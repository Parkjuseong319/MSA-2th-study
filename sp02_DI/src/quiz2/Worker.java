package quiz2;

import java.util.Scanner;

public class Worker implements PersonInterface {
	private String name, position, department;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸�: ");
		this.name = sc.next();
		System.out.print("����: ");
		this.position = sc.next();
		System.out.print("�Ҽ� �μ���: ");
		this.department = sc.next();
	}

	@Override
	public void output() {
		System.out.println("�̸�: " + name + "\n����: " + position  + "\n�μ�: " +department );
	}
	
}
