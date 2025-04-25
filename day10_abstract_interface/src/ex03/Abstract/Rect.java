package ex03.Abstract;

public class Rect extends Shape {	//Sub class
	int h = 10;
	
	@Override
	public double calc(double x) {
		result = h * x;
		return result;
	}

	@Override
	public void show(String name) {
		calc(8.8);
		System.out.println(result + "넓이의 " + name + "이 그려졌습니다.");
	}

}
