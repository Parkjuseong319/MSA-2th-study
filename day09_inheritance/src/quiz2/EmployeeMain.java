package quiz2;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.show();
		System.out.println("===============================================");
		
		Regular e2 = new Regular();
		e2.show();
		System.out.println("===============================================");
		
		Sales e3 = new Sales();
		e3.show();
		System.out.println("===============================================");
		Part_time e4 = new Part_time("주성", 59, "010-9999-9999", "개발부", 20);
		e4.show();
		
	}
}
