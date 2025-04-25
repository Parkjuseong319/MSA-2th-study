package ex07.stringbuffer;

public class StringBufferMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);			// String관련 클래스는 객체를 출력하면 String data가 나온다. 
		
		sb.append(" is pencil");	// 문자열 추가. 무조건 제일 뒤에 추가
		System.out.println(sb);
		
//		System.out.println(sb.reverse());		// 문자열 뒤집는다.
		System.out.println("=========================");
		
		sb.insert(7, " my");		// 문자열 삽입. 원하는 위치에 삽입 가능. 시작 인덱스, 넣을 문자
		System.out.println(sb);
		
		sb.replace(8, 10, "your");		// 문자열 변경(교체). 시작 인덱스, 끝 인덱스, 변경할 문자
		System.out.println(sb);
		System.out.println(sb.capacity());

		System.out.println("=========================");
		System.out.println(sb.indexOf("your"));
		System.out.println(sb.indexOf("s"));		// 앞에서부터 센다.
		System.out.println(sb.lastIndexOf("s"));	// 뒤에서부터 센다.
		System.out.println("=========================");
		
		
		sb.delete(0, 5);		// 문자열 삭제. 시작 인덱스, 끝 인덱스
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(20);		// 길이가 잘린 뒤 데이터는 사라진다.
		System.out.println(sb);
		
	}

}
