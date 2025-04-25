package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();	// HashSet과는 다르게 정렬되어 값이 들어간다.
		
		int[] score = { 100, 85, 95, 50, 45, 35, 65, 45, 20, 65, 100};
		
		for (int i = 0; i < score.length; i++) {
//			set.add(score[i]);
			set.add(new Integer(score[i]));
		}
		System.out.println(set);
		
		System.out.println("50보다 작은 값: " + set.headSet(50));	// parameter보다 미만 값 출력
		System.out.println("50보다 큰 값: " + set.tailSet(50));	// parameter보다 이상 값 출력
	}
}
