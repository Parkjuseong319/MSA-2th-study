package quiz2;

import java.util.Scanner;

public class Worker implements PersonInterface {
	private String name, position, department;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("너의 이름: ");
		this.name = sc.next();
		System.out.print("직급: ");
		this.position = sc.next();
		System.out.print("소속 부서명: ");
		this.department = sc.next();
	}

	@Override
	public void output() {
		System.out.println("이름: " + name + "\n직급: " + position  + "\n부서: " +department );
	}
	
}
