package ex06.inheritance;

public class Shape {	// super class
	
	protected int w, h;
	double result;
	
	public Shape() {	// 생성자 함수 - 멤버 변수의 초기화를 담당
		w = 10; h = 10; result =0;
	}
	public Shape(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public double calc() {
		return result;
	}
	
	public void show() {
		System.out.println(w + ", " + h);
	}
	
	// getter / setter
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
}
