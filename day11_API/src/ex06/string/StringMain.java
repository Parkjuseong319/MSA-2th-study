package ex06.string;

public class StringMain {
	public static void main(String[] args) {
		int x = 3, y = 5;
		System.out.println("x = " + x + ", y = " + y);
		x = y;
		System.out.println("x = " + x + ", y = " + y);
		
		String s1 = "korea";
		String s2 = "happy";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode: " + s1.hashCode() + ",\t s2 = " + s2.hashCode());
		s1 = s2;
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode: " + s1.hashCode() + ",\t s2 = " + s2.hashCode());
		
		s2 = "seoul";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode: " + s1.hashCode() + ",\t s2 = " + s2.hashCode());
		
		s2 = "korea";
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println("hashcode: " + s1.hashCode() + ",\t s2 = " + s2.hashCode());
		// 값이 수시로 바뀔땐 불변객체인 String class가 아닌 StringBuffer, StringBuilder 를 사용하여 공간복잡도를 낮춘다.
		
		String s3 = "korea";
		s1 = "zoo";
		System.out.println("s1 = " + s1);
		System.out.println("hashcode s1: " + s1.hashCode());
		s3 = "zoo";
		System.out.println("s3 = " + s3);
		System.out.println("hashcode s1: " + s3.hashCode());
		
	}
}
