package quiz2;

public class Employee {
	protected int no;
	protected String name, part, number, role;
	
	public Employee() {
		this.no = 1;
		this.name = "zoo";
		this.part = "개발부서";
		this.number = "010-1111-1111";
		this.role = "사원";
	}
	
	public void show() {
		System.out.println("사번: "+ no + "\n이름: " + name + "\n부서: " + part + "\n직급: "+role+"\n연락처: " + number);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
