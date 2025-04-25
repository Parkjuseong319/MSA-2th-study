package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// Set : 순서업소 중복 허용하지 않는 자료구조
public class MainEntry {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();	
		hs.add("키보드");
		hs.add("마우스");
		hs.add("텀블러");
		hs.add("안경");
		hs.add("키보드");
		
		System.out.println("요소 개수: " + hs.size());		// 중복이 허용되지 않아 4가 출력된다.
		System.out.println(hs);				// 순서가 없다
		
		HashSet<Integer> hs2 = new HashSet<>();		// jdk5 버전 이후 앞에서 제네릭 선언했으면 뒤에는 안해도 된다.
		// 제네릭에는 primitive type은 넣을 수 없고 reference type만 넣을 수 있다.
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add("string");
		System.out.println(hs2);
		
		HashSet hs3 = new HashSet<>();		// 타입 미지정
		hs3.add(12.34);
		hs3.add("no error");
		hs3.add(300);
		hs3.add('A');
		System.out.println(hs3);
		
		Iterator it = hs3.iterator();
		while(it.hasNext()) {		// 다음요소가 있다면
			System.out.println(it.next());	// 요소 꺼내와서 출력함. next()는 추상메서드
		}
		System.out.println();
		it = hs.iterator();
		while(it.hasNext()) {		// 다음요소가 있다면
			System.out.println(it.next());	// 요소 꺼내와서 출력함. next()는 추상메서드
		}
		
		
	}
}
