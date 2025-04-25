package quiz2;

public class Sales extends Regular{
	double commision;
	
	public Sales() {
		this.commision = pay*0.05;
		this.part = "영업부";
	}
	
	public double getCommision() {
		return commision;
	}
	

	public void setCommision(double commision) {
		this.commision = commision;
	}

	@Override
	public int calc_pay() {
		this.commision = pay * 0.1;
		return (int)commision + pay;
	}

	@Override
	public void show() {
		super.show();
	}
	
}
