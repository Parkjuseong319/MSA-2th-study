package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector	v = new Vector<>(3, 5);
		
		v.addElement("java");	// String type
		v.addElement(new Double(10.2)); 	// double type
		v.addElement(date); 	// object type
		System.out.println("------------ 3개 객체 추가 -----------");
		System.out.println("size: " + v.size() + ", capacity: " + v.capacity());
		
		for (i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
		System.out.println("------------ 10개 객체 추가 -----------");
		System.out.println("size: " + v.size() + ", capacity: " + v.capacity());
	
		System.out.println("------------ Vector 내용 출력 -----------");
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
		
		System.out.println("------------ 객체 내용 포함 확인 -----------");
		if(v.contains("java")) {	// boolean type return. 요소가 있는지 없는지 판단하는 메서드
			System.out.println("포함되어 있습니다.");
		}else System.out.println("java 없다");
		
		System.out.println("10.2 객체 위치? " + v.indexOf(10.2));
		System.out.println("입력 시간: " + date);
		System.out.println();
		System.out.println(v.get(v.indexOf(date)));
		System.out.println(v.get(2));
		
		// date object delete
		v.removeElementAt(v.indexOf(date));
		System.out.println("==============");
		System.out.println("size: " + v.size() + ", capacity: " + v.capacity());
		
		for(i=0; i<v.size(); i++) {	// 이렇게 했을 경우 요소가 지워지면 인덱스가 땡겨지며 채워져서 원래 리스트의 짝수번째 요소만 지워진다.
//			v.removeElementAt(i);
//			v.remove(i);	// 인덱스 번호에 해당하는걸 지운다.
//			v.remove(10.2);	// 해당 요소 이름을 지울 수 있다.
//			v.remove("java");
//			v.removeAllElements();
			int a = 0;
			v.remove(a);
		}
		System.out.println("==============");
		System.out.println("size: " + v.size() + ", capacity: " + v.capacity());
		System.out.println(v);
		
		System.out.println("===================================");
		v.setElementAt("java", 2); 		// 3번째 위치에 java를 삽입
		
		en = v.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
		System.out.println();
		v.trimToSize();
		System.out.println("size: " + v.size() + ", capacity: " + v.capacity());

		v.setSize(2);  // 크기를 강제로 2로 조정
		en = v.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement() + " ");
		}
		System.out.println("size: " + v.size() + ", capacity: " + v.capacity());
		
		
	}
}