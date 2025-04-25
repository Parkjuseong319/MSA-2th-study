package ex03.returnValue;

public class MainEntry {
	public static void main(String[] args) {
		
		int x =5;
		System.out.println(x);
		x *=100;
		
		if( x == 500) return;	// 제어권 넘김
		
		System.out.println(x);
		System.out.println("여기까지 출력-----");
	}
	
	
	
}
/*
> return
	return 값; // 1개만 가능
	ex) int = x , int = y;
		return x + y; 	// 정상
		return x, y;	// error
		return;		// 호출쪽으로 제어권 넘김
*/