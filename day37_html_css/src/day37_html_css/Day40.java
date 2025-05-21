package day37_html_css;

public class Day40 {
	public static void main(String[] args) {
		System.out.println(solution("110010101001")[0] + " " + solution("110010101001")[1]);
	}
	
	public static int[] solution(String s) {
        char[] ch = s.toCharArray();
		int count = 0;
		int zeroCount = 0;
		// while 문 안돌아간다.
		while(ch.length > 1) {
			int temp = 0;
			for (int i = 0; i< ch.length; i++) {
				if(ch[i] == '0') {
					zeroCount++;
				}else temp++;				
			}
			ch = Integer.toBinaryString(temp).toCharArray();
			count++;
		}
		
		int[] answer = {count, zeroCount };
		return answer;
    }
}
