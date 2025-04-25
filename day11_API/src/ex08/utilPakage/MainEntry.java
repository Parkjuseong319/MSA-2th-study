package ex08.utilPakage;

import java.util.*;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();		// system이 갖고있는 날짜 얻어온다
//		System.out.println(c);
		System.out.print(c.get(Calendar.YEAR) + "년");
		System.out.print((c.get(Calendar.MONTH)+1) + "월");		// 월은 0부터 시작해서 하나 밀린다.
		System.out.println(c.get(Calendar.DATE) + "일");
		System.out.println("=========================");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 " + h + ":" + m + ":" + s + "입니다");
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2018, 12, 20, 0, 0);
		if(c1.after(c2)) {
			System.out.println("현재 시간은 2018년도 1월 1일 이후 입니다.");
		}else if(c1.before(c2)) {
			System.out.println("현재 시간은 2018년도 1월 1일 이전 입니다.");
		}else if(c1.equals(c2)) {
			System.out.println("현재 시간은 2018년도 1월 1일 입니다.");
		}
		
	}
}
