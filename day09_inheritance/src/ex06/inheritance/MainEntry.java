package ex06.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		
		Shape sh = new Circle();	// 부모로 객체 생성 가능
		sh.show();
		
		sh = new Triangle();
		sh.show();
		
		
//		Triangle tri = new Triangle();
//		tri.show();
		
//		Circle c = new Circle();
//		c.show();
		
//		Shape sh = new Shape();
//		sh.show();
	}
}
