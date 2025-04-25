package ex04.quiz;

public class MainEntry {
	public static void main(String[] args) {
		Sawon ss = new Sawon();
		ss.output();
		System.out.println("================================");
		Sawon ss2 = new Sawon(5, 4500);
		ss2.setPart("마케팅 사업부");
		ss2.setName("js");
		ss2.setRole("과장");
		ss2.setPhone_number("010-1111-2222");
		ss2.output();
		
		System.out.println("================================");
		Sawon ss3 = new Sawon("zoo", "개발사업부", "시니어", "010-5678-9999");
		ss3.setNum(3);
		ss3.setPay(7500);
		ss3.output();
	}
}
