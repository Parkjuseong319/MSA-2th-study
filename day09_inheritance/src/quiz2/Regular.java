package quiz2;

public class Regular extends Employee {
	protected int pay;
	
	public Regular() {
		this.pay = 3000;
	}
	
	public int calc_pay() {
		return pay;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("급여: " + calc_pay());
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
}
