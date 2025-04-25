package ex04.quiz;

public class Sawon {
	private int num, pay;
	private String name, phone_number, part, role;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Sawon() {
		num = 1; pay = 3000;
		name = "KOSA"; phone_number = "010-1234-5678"; part = "개발사업부"; role = "주니어";
	}
	public Sawon(int num, int pay) {
		this.num = num;
		this.pay = pay;
	}
	
	public Sawon(String name, String part, String role, String phone_number) {
		this.name = name;
		this.part = part;
		this.role = role;
		this.phone_number = phone_number;
	}
	
	public void output() {
		System.out.println("사번: " + num + "\n이름: " + name + "\n직급: " + role + "\n부서: " + part + "\n급여: " + pay + "\n연락처: " + phone_number);
	}
}
