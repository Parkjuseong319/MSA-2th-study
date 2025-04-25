package quiz;

//String str = "ABC def kbsmbc 123 BB"; 주어진 문자열에서 대문자 개수와 소문자 개수 출력하는 프로그램 작성
public class Quiz2 {
	public static void main(String[] args) {
		String str = "ABC def kbsmbc 123 BB"; 
		char[] ch = str.toCharArray();
		int upper = 0;
		int lower = 0;
		int etc = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if(Character.isUpperCase(ch[i])) upper += 1;
			else if(Character.isLowerCase(ch[i])) lower += 1;
			else etc +=1;
		}
		System.out.println("str의 대문자 개수: " + upper + "개");
		System.out.println("str의 소문자 개수: " + lower + "개");
		System.out.println("알파벳 아닌 것의 개수: " + etc + "개");
	}
}
