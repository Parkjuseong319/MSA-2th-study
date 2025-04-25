package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4", "4"};
		// Set에서 타입이 다를 경우 다른 값으로 인식한다.
		
		Set	set = new HashSet<>();
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
	}
}
