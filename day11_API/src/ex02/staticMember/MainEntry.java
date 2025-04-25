package ex02.staticMember;

class Atm {
	int count;			// instance member
	static int total;	// static member - 초기하 1회만한다. 이전에 있던 값을 쓴다.
	
	public Atm(int amount) {	// constructor method
		count += amount;
		total += amount;
	}
	
	// static member 에서 일반 멤버 변수는 사용할 수 없다.
	public static void view() {
		total += 100;
//		count += 100;
	}
	
	public void display() {
		count += 50;
		total += 30;
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}	// Atm end


public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(5000);
		at.display();	// c: 5000, t: 5000
		System.out.println("============================================");
		Atm at2 = new Atm(5000);
		at2.display();	// c: 5000, t: 10000
		System.out.println("============================================");
		Atm at3 = new Atm(5000);
		at3.display();	// c: 5000, t: 15000
		
	}
}
