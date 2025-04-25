package ex02.oop;

public class Rectangle {
	// x, y, x2, y2
	// getter/setter method, output method
	
	int x, y, x2, y2;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void output(int x, int y, int x2, int y2) {
		int width=0;
		if((x2 > x && y2 > y) || (x>0 && y > 0)) width = (x2-x) * (y2 - y);
		else if((x2 < x && y2 < y) || (x>0 && y > 0)) width = (x2-x) * (y - y2);
		else if((x2 > x && y2 > y) || (x<0 && y > 0)) width = (x2-x) * (y - y2);
		
		else {
			System.out.println("좌표선상에서 더 작은 값을 먼저 입력해"); System.exit(0);
		}
		System.out.println("직사각형의 넓이는 " + width + "이다.");
	}
	
}
