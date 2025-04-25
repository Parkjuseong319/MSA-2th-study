package ex07.stringbuffer;

public class MainEntry {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());	// 681842940
		
		System.out.println("length    /     capacity");
		System.out.println(sb.length() + "               " + sb.capacity());
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len+ "               " + size);
		
		sb.append("msa-th2");
		len = sb.length();		size = sb.capacity();
		System.out.println(len+ "               " + size);
		
		// 길이가 용량을 넘어가게 되면 용량이 2배 + 2(문자열에는 항상 null이 마지막에 붙기 때문)로 늘어난다.
		sb.append("happyvirus");
		len = sb.length();		size = sb.capacity();
		System.out.println(len+ "               " + size);
		sb.append("12345 67890 한글 32165498");
		len = sb.length();		size = sb.capacity();
		System.out.println(len+ "               " + size);
		System.out.println(sb.hashCode());	// 681842940 주소가 바뀌지 않음
		
		sb.trimToSize();		// 용량크기 조절. 불필요한 용량 제거
		len = sb.length();		size = sb.capacity();
		System.out.println(len+ "               " + size);
	}
}
