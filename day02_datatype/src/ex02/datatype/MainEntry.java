package ex02.datatype;

public class MainEntry {
	
	static int Num;		// 결과적으로 자동초기화가 되었다. 정수형은 0, 실수형은 0.0, 문자열은 Null로 초기화
	static String str;
	
	
	public static void main(String[] args) {	// 시작점(진입점)
		// 자바에선 실질적으로 지역변수, 전역변수가 없다. 그렇게 보이게 하는 것이 있다.
		
		System.out.println(Num);
		System.out.println(str);
		
		//int x; // 지역변수는 반드시 초기화하고 사용해야한다 
		int x = 99;
		System.out.println(x);
		
		int su = 30;
		System.out.println(su);	// 4byte
		System.out.println(100); // 4byte. 기본적으로 int형으로 인식
		
		long num = 200;
		System.out.println(num); // 8byte
		System.out.println(1000L); // 8byte
		
		double d = 12.34;
		System.out.println(d);  // 8byte
		System.out.println(34.56); // 8byte
		System.out.println(5.67f); // 4byte. 기본이 double형이지만 float형으로 변환
		
		//float f = 12.34;	// error. 12.34는 double형인데 더 작은 float 타입에 넣으려 했기 때문에 에러가 발생
		// 즉 heap에서 stack으로 참조하는데 잘못된 참조를 하기 때문
		float f = 12.34f;
		System.out.println(f);
	}
}
