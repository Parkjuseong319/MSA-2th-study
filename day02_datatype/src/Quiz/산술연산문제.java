package Quiz;

public class 산술연산문제 {
	
	public static void main(String[] args) {
		int pay = 567890;
		
		// 연산자 /, % 이용해서 만원이 몇장, 천원이 몇장, 백원, 십원 몇장인지 출력
		System.out.println("result: ");
		System.out.println("만원: "+ (pay/10000) + "장");
		System.out.println("천원: "+ (pay%10000/1000) + "장");
		System.out.println("백원: "+ (pay%1000/100) + "개");
		System.out.println("십원: "+ (pay%100/10) + "개");
	}
}
// 절차적 프로그래밍 코딩 순서
// 1. 변수선언
// 2. 메세지 출력 및 입력받기
// 3. 처리(계산)
// 4. 결과출력(화면)