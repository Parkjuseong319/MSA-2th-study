/*
package ex08.utilPakage;

import java.util.StringTokenizer;

public class StringtokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|", true);	// 구분자 지정 가능
		
		while(token.hasMoreTokens()) {	// 다음 요소가 있을때 true 리턴
//			System.out.println(token.nextToken());
			String str = token.nextToken();
			
			if(str.equals("=")) System.out.print("\t");
			else if(str.equals("|")) System.out.print("\n");
			else System.out.print(str);
		}
	}
}
//*/
//*
package ex08.utilPakage;

import java.util.StringTokenizer;

public class StringtokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("김연아 박태환 손연재 이휘 김지은 박준 공현지");	// 구분자 지정 가능
		//new StringTokenizer("김연아 박태환 손연재 이휘 김지은 박준 공현지");
		
		while(token.hasMoreTokens()) {	// 다음 요소가 있을때 true 리턴
			System.out.println(token.nextToken());
		}
//		String str = "김연아 박태환 손연재 이휘 김지은 박준 공현지";
//		String[] arr = new String[30];
//		arr = str.split(" ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
}
//*/