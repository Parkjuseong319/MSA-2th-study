//*
package ex02.datatype;

public class DataType2 {
	// 모든 자료형은 자신의 범위(크기)를 안벗어난다.
	// 형변환
	public static void main(String[] args) {
		short sh = 3;	// -32,768 ~ 32,767
		int num = 50000;	// 약 -21억 ~ 21억
		
		// 묵시적형변환: 작은 자료형이 큰자료형에 들어가면 자동형변환이 된다.
		num = sh; // int (4byte) = short (2byte)
		
		System.out.println(sh + ", " + num);
		
		// 명시적 형변환: 큰 자료형이 작은 자료형에 넣을때
		// 데이터 손실이 발생한다.
		num = 123;
		sh = (short)num; // short (2byte) = int (4byte)
		System.out.println(sh + " " + num);
	}
}
//*/

/*
package ex02.datatype;

public class DataType2 {
	// 모든 자료형은 자신의 범위(크기)를 안벗어난다.
	public static void main(String[] args) {
		short sh = 32767;	// -32,768 ~ 32,767
		int num = 50000;	// 약 -21억 ~ 21억
		
		System.out.println(sh + ", " + num);
		
//		num = -32769;		// 범위를 넘어가면 반대편 범위로 넘어간다.
		num = 32770;
		
		sh = (short)num;	// 더 큰 자료형에서 작은 자료형에 참조하면 에러가 뜬다. 캐스팅(명시적 형변환) 필요
		System.out.println(sh + ", " + num);
		
	}
}
*/

// 한줄 주석
/* 여러 줄 주석 */
